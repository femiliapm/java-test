package inheritance;

// inheritance

// 1. extends = class mewarisi ke class
// 2. implements = interface mewarisi ke class

public class Student extends Person {
  private int sks;
  private String courseName;

  // SETTER-GETTER
  public int getSks() {
    return sks;
  }

  public void setSks(int sks) {
    this.sks = sks;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  @Override
  public String getFullName() {
    // TODO Auto-generated method stub
    if (sks >= 100) {
      return super.getFullName() + ". ST";
    }
    return super.getFullName();
  }

}
