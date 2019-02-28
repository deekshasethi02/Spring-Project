package com.example.pbapp.controller;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.pbapp.command.LoginCommand;
import com.example.pbapp.command.UserRegistrationCommand;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;
import com.example.pbapp.exception.BlockUserException;
import com.example.pbapp.exception.UserAlreadyExistsException;
import com.example.pbapp.service.ContactService;
import com.example.pbapp.service.UserService;
@Controller
public class UserController {
    @Autowired
    private UserService userservice;
    
    @Autowired
    private ContactService contactservice;
    
    @RequestMapping(value={"/user/dashboard"})
    private String userDashboard() {
        return "user/dashboard_user";
    }
    @RequestMapping(value={"/admin/dashboard"})
    private String adminDashboard() {
        return "user/dashboard_admin";
    }
    @RequestMapping(value={"/login"})
    private String login(Model model) {
        model.addAttribute("command", new LoginCommand());
        System.out.println(model.containsAttribute("err"));
        return "login";
    }
    @RequestMapping(value={"/authenticate"},method=RequestMethod.POST)
    private String authenticate(@ModelAttribute("command") LoginCommand loginCommand,Model model,HttpSession session) {
    
        //1. Take login credential from form
        //2. get user based on loginname and password
        //3. if loggedinuser - success then send to appropriate dashboard
        //if role is not available - InvalidRoleError should be send back to login page
        //4. if loggedinuser - failed then redirected to login page
        try {
            User loggedinuser = userservice.login(loginCommand.getLoginname(), loginCommand.getPassword());
            /*System.out.println(loggedinuser.getPassword());*/
            //success
            if(loggedinuser!=null) {
                if(loggedinuser.getRole()==userservice.ROLE_ADMIN) {
                    //set session
                    setLoggedInUserInSession(session, loggedinuser);
                    return "redirect:/admin/dashboard";
                } else if(loggedinuser.getRole()==userservice.ROLE_USER) {
                    //set session in user - user, userid, role
                    setLoggedInUserInSession(session, loggedinuser);
                    return "redirect:/user/dashboard";
                } else {
                    model.addAttribute("err", "Invalid Role");
                    return "login";
                }
            }
            //failed
            else {
                model.addAttribute("err", "Invalid User!! Check your credentials!!");
                return "login";
            }
        } catch (BlockUserException e) {
            //return "redirect:/login?errMsg="+e.getMessage();
            model.addAttribute("err", e.getMessage());
            return "login";
        }
        
    }
    private void setLoggedInUserInSession(HttpSession session, User loggedinuser) {
        session.setAttribute("loggedinuser", loggedinuser);
        session.setAttribute("userid", loggedinuser.getId());
        session.setAttribute("role", loggedinuser.getRole());
    }
    @RequestMapping(value={"/registration"})
    private String registration(Model model) {
        model.addAttribute("command", new UserRegistrationCommand());
        return "registration";
    }
    @RequestMapping(value={"/logout"})
    private String logout(Model model,HttpSession session) {
        session.invalidate();
        model.addAttribute("command", new LoginCommand());
        
        return "login";
    }
    @RequestMapping(value={"/listContact"})
    private String listContact(HttpSession session) {
        
         List<Contact> contacts = contactservice.findUserContact((Integer)session.getAttribute("userid"));
        session.setAttribute("contacts", contacts);
         return "listContact";
    }
    @RequestMapping(value={"/listUser"})
    private String listUser(HttpSession session) {
         List<User> users = userservice.getUserList();
        session.setAttribute("users", users);
         return "listUser";
    }
    @RequestMapping(value={"/register"},method=RequestMethod.POST)
    private String register(@ModelAttribute("command") UserRegistrationCommand userRegistrationCommand,Model model) throws NoSuchAlgorithmException, NoSuchProviderException {
        
        System.out.println(userRegistrationCommand.getUser());
        try {
            userservice.register(userRegistrationCommand.getUser());
            model.addAttribute("err","Thank You!! You are successfully registered");
            
            return "redirect:/login";
            
        } catch (UserAlreadyExistsException e) {
            // TODO Auto-generated catch block
            model.addAttribute("err",e.getMessage());
            return "registration";
            
        }
        
    }
}
