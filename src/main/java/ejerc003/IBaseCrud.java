package ejerc003;

import java.util.ArrayList;
import java.util.List;

public interface IBaseCrud<T> {
	
	List<T> getAll();
	void delete(T user);
	void add(T user);
	T getId(String Id);
	void update(T user);

}
