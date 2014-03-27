public class AirlockDoor implements Runnable,Door {

  volatile int numRequests = 0;
  volatile String doorID; 
  volatile AirLock Lock;

  AirlockDoor(String s, AirLock a){
    doorID = s;
    Lock = a;
  }

  @Override
  public void run() {

  }

  public void requestToOpen() {
    numRequests++;
    System.out.println("Request to open.");
  }

}
