package ejerc003;

import java.util.ArrayList;

public interface IUsuarios {
	
	ArrayList<String> getAllUsers();
	void deleteUser(String user);
	void addUser(String user);
	boolean anyUser(String user);
	String getUser(String user);
	void UpdateUser(String user, String nuevo);

}
