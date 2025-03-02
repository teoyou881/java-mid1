package lang.enumeration.problem1;

public enum AuthGuest {
  GUEST(1, "guest"), LOGIN(2, "login user"), ADMIN(3, "administer");


  private final int level;
  private final String des;

  AuthGuest(int level, String des) {
    this.level = level;
    this.des = des;

  }

  public int getLevel() {
    return this.level;
  }

  public String getDes() {
    return des;
  }
}
