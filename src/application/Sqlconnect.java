package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Sqlconnect {
Connection conn = null;
	
	
	public static Connection ConnectDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
			//JOptionPane.showMessageDialog(null, "Connection Established");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	public static ObservableList<User> getDataUsers(){
        Connection conn = ConnectDb();
        ObservableList<User> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){   
                list.add(new User(rs.getString("Username"), rs.getString("Password"), rs.getInt("UnitNo"), rs.getInt("CardNo"), rs.getInt("CVV")));               
            }
            
        } catch (Exception e) {
        }
        return list;
    }
	public static ObservableList<Admin> getDataAdmins(){
        Connection conn = ConnectDb();
        ObservableList<Admin> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from admin");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){   
                list.add(new Admin(rs.getString("Username"), rs.getString("Password"), rs.getInt("ID")));               
            }
            
        } catch (Exception e) {
        }
        return list;
    }
}
