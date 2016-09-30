package com.hm.javarest;

public abstract class UserService {

	
	public abstract <T> void addUser(T t);
	
	public abstract void getUsers();
	
	public abstract void getUserByName(String name);
	
}
