package es.fmm.ejerc003;

public class Usuario extends BaseModel {
	

	public String Nombre;
	
	public Usuario(String Id, String nombre) 
	{
		super.Id = Id;
		this.Nombre = nombre;
	}
	
	
	public String getNombre() 
	{
		return Nombre;
	}
	
	@Override
	public String toString() 
	{
		return "Nombre: "+ Nombre + " Id: " + Id;
	}

}
