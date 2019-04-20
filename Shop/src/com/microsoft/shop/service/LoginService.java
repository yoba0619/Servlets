package com.microsoft.shop.service;

public class LoginService {
	public boolean authenticate(String username, String password) {
		return username!=null && username.trim().equalsIgnoreCase("java") && password!=null && password.trim().equalsIgnoreCase("java");
	}
}
