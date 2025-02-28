package lang.immutable.address;

public class MemberMainV1 {

  public static void main(String[] args) {
    Address address = new Address("서울");
    MemberV1 memberA = new MemberV1("회원A", address);
    MemberV1 memberB = new MemberV1("회원B", address);

    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);

    //Member A and Member B are referring to the same Address instance.
    //The moment Member B's address is changed to Busan, Member A's address is also changed to Busan.
    memberB.getAddress().setValue("부산");
    System.out.println("부산 -> memberB.address");
    System.out.println("memberA = " + memberA);
    System.out.println("memberB = " + memberB);
  }
}
