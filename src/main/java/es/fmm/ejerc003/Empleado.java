package es.fmm.ejerc003;


public class Empleado extends BaseModel {
	
	public String Nombre;
	public String Departamento;
	
	public Empleado(String Id, String Nombre, String Departamento) 
	{
		super.Id = Id;
		this.Nombre = Nombre;
		this.Departamento = Departamento;
	}
	
	
	public String getNombre() 
	{
		return Nombre;
	}
	
	public String Departamento() 
	{
		return Departamento;
	}
	

	

}
