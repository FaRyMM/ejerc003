package es.fmm.ejerc003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestUsuariosIntegracion {

	private IBaseCrud<Usuario> crud;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		this.crud = new BaseCrud<Usuario>();
	}
	
	@Test
	void testagregarYobtener()
	{
		Usuario user1 = new Usuario("1", "fary");
		Usuario user2 = new Usuario("2", "marina");
		this.crud.add(user1);
		this.crud.add(user2);
		Usuario resultado = this.crud.getId("1");
		assertEquals(user1, resultado);
	}
	
	@Test
	void testEliminarUsuario() 
	{
		Usuario user1 = new Usuario("1", "fary");
		this.crud.add(user1);
		
		this.crud.delete(user1);
		
		Usuario eliminado = this.crud.getId("1");
		
		assertNull(eliminado);
	}
	
	@Test
	void TestActulizarUsuario() 
	{
		Usuario user1 = new Usuario("1", "fary");
		this.crud.add(user1);
		
		Usuario actualizacion = new Usuario("1", "Faris");
		this.crud.update(actualizacion);
		
		Usuario resultado = this.crud.getId("1");
		assertEquals("Faris", resultado.getNombre());
	}
	
	

	

}
