package ejerc003;

public class Usuario {
	
	public String Id;
	public String Nombre;
	
	public Usuario(String Id, String nombre) 
	{
		this.Id = Id;
		this.Nombre = nombre;
	}
	
	public String getId() 
	{
		return Id;
	}
	
	public String getNombre() 
	{
		return Nombre;
	}

}
