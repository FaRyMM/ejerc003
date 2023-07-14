package es.fmm.ejerc003;

import java.util.ArrayList;
import java.util.List;

public class BaseCrud<T extends BaseModel> implements IBaseCrud<T>{
	
	private List<T> usuarios;
	
	public BaseCrud() 
	{
		usuarios = new ArrayList<>();
	}

	@Override
	public List<T> getAll() {
		
		return usuarios;
	}

	@Override
	public void delete(T user) {
		usuarios.remove(user);
	}

	@Override
	public void add(T user) {
		usuarios.add(user);
	}

	@Override
	public void update(T userUpdate) {
		T user = getId(userUpdate.getId());
		int index = usuarios.indexOf(user);
		usuarios.set(index, userUpdate);
	}

	@Override
	public T getId(String Id) {
		for(T user : usuarios)
		{
			if(user.getId().equals(Id)) 
			{
				return user;
			}
		}
		return null;
	}
	
	
	
}
