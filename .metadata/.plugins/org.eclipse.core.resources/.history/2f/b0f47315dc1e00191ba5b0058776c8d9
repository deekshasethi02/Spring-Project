package com.example.userapp.controller;

import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.userapp.domain.User;
import com.example.userapp.service.MapValidationErrorService;
import com.example.userapp.service.UserService;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserResource {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private MapValidationErrorService mapValidationErrorService;
    
    @PostMapping("")
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> createUser(@Valid @RequestBody User user , BindingResult result) {
        
        ResponseEntity<?>errorMap = mapValidationErrorService.mapValidationError(result);
        if(errorMap!=null)
                    return errorMap;
        userService.save(user);
        
        return new ResponseEntity<User>(user,HttpStatus.CREATED);
        
    }
    
    @GetMapping("")
    public ResponseEntity<?> listUser() {
        System.out.println("reached");
        List<User>list = userService.findAll();
        return new ResponseEntity<List<User>>(list,HttpStatus.OK);
        
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> findUser(@PathVariable Integer id) {
        System.out.println("reached");
        User user = userService.findById(id);
        return new ResponseEntity<User>(user,HttpStatus.OK);
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        System.out.println("reached");
        int idd = userService.delete(id);
        return new ResponseEntity<Integer>(id,HttpStatus.OK);
        
    }
    
    @PutMapping("")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        System.out.println("reached");
        userService.update(user);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
    
    
}









//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.userapp.domain.User;
//import com.example.userapp.service.MapValidationErrorService;
//import com.example.userapp.service.UserService;
//
//@RestController
//@RequestMapping("/users")
//public class UserResource {
//	@Autowired
//	private UserService userService;
//	
//	@Autowired
//	private MapValidationErrorService mapValidatonErrorService;
//	
//	@PostMapping("")
//	public ResponseEntity<?> createUser(@Valid @RequestBody User user, BindingResult result) {
//		
//		ResponseEntity<?> errorMap = mapValidatonErrorService.mapValidationError(result);
//		if(errorMap!=null) {
//		return errorMap;
//		}
//		userService.save(user);
//		return new ResponseEntity<String>(HttpStatus.OK);
//		
//	}
//	
//	
////	@PostMapping("")
////	public ResponseEntity<User> createUser(@RequestBody User user)
////	{	
////		userService.save(user);
////		return new ResponseEntity<User>(HttpStatus.CREATED);
////		
////	}
//	
//	@GetMapping("lists")
//	public ResponseEntity<List<User>> listUsers()
//	{	
//		List<User> list = userService.findAll();
//		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
//		
//	}
//	@GetMapping("list/{id}")
//	public ResponseEntity<User> getArticleById(@PathVariable("id") Integer id) {
//		User user = userService.findById(id);
//		return new ResponseEntity<User>(user, HttpStatus.OK);
//	}
//	
//	@DeleteMapping("delete/{id}")
//	public ResponseEntity<User> deleteUserById(@PathVariable("id") Integer id) {
//		userService.delete(id);
//		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
//	}
//	
////	@DeleteMapping("deleteuser")
////	public ResponseEntity<User> deleteUser(@RequestBody User user) {
////		userService.delete(user);
////		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
////	}
//	
//	@PutMapping("update")
//	public ResponseEntity<User> updateUser(@RequestBody User user) {
//		userService.update(user);
//		return new ResponseEntity<User>(user, HttpStatus.OK);
//	}
//	
//	
//}
