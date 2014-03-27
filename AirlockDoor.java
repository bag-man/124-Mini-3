public class AirlockDoor implements Runnable,Door {

  volatile boolean request;
  private String doorID; 
  private AirLock Lock;

  AirlockDoor(String s, AirLock a){
    doorID = s;
    Lock = a;
  }

  @Override
  public void run() {
    while(true) {
      if(request == true) { 
	synchronized(Lock) {
	  System.out.println(doorID + " open");
	  try {
	    Thread.sleep(5000);
	  } catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	  }
	  System.out.println(doorID + " closed");
	  request = false;
	}
	try {
	  Thread.sleep(1000);
	} catch(InterruptedException ex) {
	  Thread.currentThread().interrupt();
	}
      }
    }
  }

  public void requestToOpen() {
    request = true;
    System.out.println("Request to open " + doorID);
  }

}
