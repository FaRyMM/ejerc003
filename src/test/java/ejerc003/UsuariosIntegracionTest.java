package ejerc003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuariosIntegracionTest {

	private IUsuarios user;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		this.user = new Usuarios();
	}
	
	@Test
	void testAdd()
	{
		this.user.addUser("fary");
		String resultado = this.user.getUser("fary");
		assertEquals("fary", resultado);
	}
	
	@Test
	void testUpdate()
	{
		this.user.addUser("fary");
		this.user.UpdateUser("fary", "faris");
		String resultado = this.user.getUser("faris");
		assertEquals("faris", resultado);
	}
	

	

}
