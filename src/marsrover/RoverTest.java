package marsrover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class RoverTest {

	private Rover rover;
	
	@Before
	public void setUp(){
		rover = new Rover();
	}
	
	
	@Test
	public void TestePosicao(){
		rover.setPosition(1, 2, 3);
		assertTrue(rover.x == 1);
		assertTrue(rover.y == 2);
		assertTrue(rover.facing == 3);
				
		/*BigDecimal menorQue50k = new BigDecimal("25000");
		conta.deposita(menorQue50k);
		assertTrue(conta.getCategoria() == Categoria.S);
		assertEquals(conta.getSaldo(), menorQue50k);
	}*/
}
}
