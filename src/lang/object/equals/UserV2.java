package lang.object.equals;

public class UserV2 {

  private String id;

  public UserV2(String id) {
    this.id = id;
  }

//  @Override
//  public boolean equals(Object obj) {
//    UserV2 user = (UserV2) obj;
//    return id.equals(user.id);
//  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true; // Return true if references are the same
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false; // Return false if obj is null or classes are different
    }
    UserV2 user = (UserV2) obj; // Cast obj to UserV1 type
    return id != null && id.equals(user.id); // Compare the id values
  }
}