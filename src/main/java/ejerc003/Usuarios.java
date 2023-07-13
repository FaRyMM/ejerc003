package ejerc003;

import java.util.ArrayList;

public class Usuarios implements IUsuarios{
	
	private ArrayList<String> usuarios;
	
	public Usuarios() 
	{
		usuarios = new ArrayList<String>();
	}

	@Override
	public ArrayList<String> getAllUsers() {
		
		return usuarios;
	}

	@Override
	public void deleteUser(String user) {
		int index = usuarios.indexOf(user);
		usuarios.remove(index);
	}

	@Override
	public void addUser(String user) {
		usuarios.add(user);
	}

	@Override
	public boolean anyUser(String user) {
		return usuarios.contains(user);
	}
	
	
	public String getUser(String user)
	{			
		int index = usuarios.indexOf(user);
		return usuarios.get(index);
	}

	@Override
	public void UpdateUser(String user, String valor) {
		int index = usuarios.indexOf(user);
		usuarios.set(index, valor);
	}
	
	
	
}
