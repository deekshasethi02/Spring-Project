package com.example.pbapp.command;
/**
 * This LoginCommand will be used as a communication between loginForm and UserController.
 * when user will login , this loginCommand should be available on login form.
 * LoginCommand will be set by the UserController at the time of showing the loginForm.
 * From login page same command will be received by model attribute.
 * @author deeksha.sethi
 *
 */
public class LoginCommand {
	
	private String loginname;
	private String password;
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
