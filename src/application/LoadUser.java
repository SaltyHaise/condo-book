package application;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import javafx.collections.ObservableList;

public class LoadUser {
	HashMap<String,String> user = new HashMap<String,String>();
	HashMap<String, String> admin = new HashMap<String,String>();
	File myFile;
	Scanner sc;
	ObservableList<User> listU;
	ObservableList<Admin> listA;
	
	public void GetLoginDataFromFile() {
		String u, p;
		listU = Sqlconnect.getDataUsers();
		listA = Sqlconnect.getDataAdmins();
		
		for (int i = 0; i < listU.size(); i++) {
			u = (listU.get(i)).getName();
			p = (listU.get(i)).getPassword();
			getUser().put(u, p);
		}
		
		for (int i = 0; i < listA.size(); i++) {
			u = (listA.get(i)).getName();
			p = (listA.get(i)).getPassword();
			getAdmin().put(u, p);
		}
		//System.out.println(getStudent());
	}
	public HashMap<String, String> getUser() {
		return user;
	}

	public void setUser(HashMap<String, String> user) {
		this.user = user;
	}

	public HashMap<String, String> getAdmin() {
		return admin;
	}

	public void setAdmin(HashMap<String, String> admin) {
		this.admin = admin;
	}
}
