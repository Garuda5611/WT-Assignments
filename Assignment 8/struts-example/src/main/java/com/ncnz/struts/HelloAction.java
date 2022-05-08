package com.ncnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Action("/hello")
@Results({
	   @Result(name = "success", location = "/results.jsp"),
	   @Result(name = "error", location = "/error.jsp")
	})
public class HelloAction {
	private String uname;
	private String password;
	public String execute() {
		if(uname.equals("mohini") && password.equals("1234"))
		{
			return "success";
		}
		else
			return "error";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
