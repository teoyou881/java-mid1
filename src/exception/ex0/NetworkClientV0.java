package exception.ex0;

public class NetworkClientV0 {

  private final String address;

  public NetworkClientV0(String address) {
    this.address = address;
  }

  public String connect() {
    //연결 성공
    System.out.println(address + " successfully connected");
    return "success";
  }

  public String send(String data) {
    //전송 성공
    System.out.println(address + " send: " + data);
    return "success";
  }

  public void disconnect() {
    System.out.println(address + " successfully disconnected");
  }
}