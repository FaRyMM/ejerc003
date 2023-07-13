package ejerc003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUsuariosUnitario {

	private IBaseCrud<Usuario> crudUser;
	private Usuario user1;
	private Usuario user2;
	
	@BeforeEach
	void setUp() 
	{
		crudUser = new BaseCrud<Usuario>();
		user1 = new Usuario("1", "Fary");
		user2 = new Usuario("1", "Faris");
	}
	
	
	@Test
	void testAgregaryObtener() {
		this.crudUser.add(user1);
		Usuario resultado = this.crudUser.getId("1");
		assertEquals(user1, resultado);
	}

}
