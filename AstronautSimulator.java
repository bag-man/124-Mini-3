/**
 * Simulates astronauts trying to open spaceship airlock doors
 * @author cwl
 *
 */
public class AstronautSimulator {
	 
	public static void main(String [] args){
		simulate();
	}

	private static void simulate() {
		// Create an AirLock object
		// STEP 1: CREATE AN EMPTY VERSION OF THE AirlockDoor CLASS
		AirlockDoor[] doors = new AirlockDoor[2];
		
		// For this prototype this can be an empty (no method)
		// class. It is a common object used in the Door class
		// that contains the single lock-key that protects the
		// imaginary airlock room from having two doors open at
		// the same time
		// STEP 2: CREATE THIS CLASS
		AirLock airLock = new AirLock();
		
		// Give the doors a name (for debugging purposes) and
		// a common airlock object used to store the "key" used
		// by a critical section of code in the Door class
		doors[0] = new AirlockDoor("1234", airLock);
		doors[1] = new AirlockDoor("1235", airLock);
		
		// AirlockDoor implements Runnable and so make sure
		// we tie the objects to Thread objects
        // STEP 3: CREATE TWO THREADS FOR THE TWO DOORS AND START THEM


		// ENTER CODE HERE
                Thread doorController1 = new Thread(doors[0]);
                Thread doorController2 = new Thread(doors[1]);
		
		doorController1.start();
		doorController2.start();

		doors[0].requestToOpen();
		try {
		  Thread.sleep(800);
		} catch(InterruptedException ex) {
		  Thread.currentThread().interrupt();
		}
		doors[0].requestToOpen();

		  
		
		// Loop infinitely trying to open airlock doors
		while (true){
			// random() returns a value in range 0.0..<1.0 multiplied by 10 and mod doors.length
			// to return either 0 or 1 in order to randomly decide which door to request
			int door = (int)((Math.random() * 10) % doors.length);
			
			// STEP 4: MAKE A REQUEST TO OPEN THE DOOR AND THEN ADD A DELAY BEFORE
			// TRYING TO OPEN ANOTHER DOOR
			// ENTER CODE HERE
		}
	}
}

