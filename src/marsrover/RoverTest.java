/**
 * 
 */
package marsrover;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author abhinaba
 *
 */
public class RoverTest extends TestCase {
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	Integer x = 0;
	Integer y = 0;
	Integer facing = N;
	/*public void testRoverMovementWithInputOne(){
		final String roverCurrentPosn = "1 2 N";
		final String movements = "LMLMLMLMM";
		final Rover rover = new Rover(roverCurrentPosn.toUpperCase());
		final String finalPos = rover.move(movements);
		System.out.println(finalPos);
		assertEquals(finalPos, "1 3 N");
		
	}*/
	
	/**
	 * This method tests the Rover Movement for the existing inputs given in the mail
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 5 5
	 * 3 3 E
	 * MMRMMRMRRM
	 * 
	 * Expected Output:
	 * 5 1 E
	 * 
	 */
	@Test
	public static void main(String args[]) {
		Rover rover = new Rover();
		rover.setPosition(1, 2, N);
		rover.process("LMLMLMLMM");
		rover.printPosition(); // prints 1 3 N
		rover.setPosition(3, 3, E);
		rover.process("MMRMMRMRRM");
		rover.printPosition(); // prints 5 1 E
	}
}
