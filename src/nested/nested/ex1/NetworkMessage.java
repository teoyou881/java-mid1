package nested.nested.ex1;

//This class is used only in the Network class.
public class NetworkMessage {

  private String content;

  public NetworkMessage(String content) {
    this.content = content;
  }

  public void print() {
    System.out.println("content = " + content);
  }
}
