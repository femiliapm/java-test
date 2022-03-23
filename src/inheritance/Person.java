package inheritance;

public class Person {
  // ATRIBUT
  private String fistName, lastName, domisili;
  private int birthYear;
  private String idCard;

  // CONSTRUCTOR : input data awal dari suatu object
  // OVERLOADING : 2 methods dengan nama yang sama dalam 1 class
  public Person() {
  }

  public Person(String kartuId) {
    this.idCard = kartuId;
  }

  // SETTER-GETTER
  public String getIdCard() {
    if (idCard == null) {
      return "Anda belum memiliki nomor id card.";
    }
    return idCard;
  }

  // OVERLOAD
  public String getFistName() {
    return fistName;
  }

  public String getFistName(String gelarDepan) {
    return gelarDepan + " " + fistName;
  }

  public String getFistName(int param, String param1) {
    return param1 + " " + fistName;
  }

  public void setFistName(String fistName) {
    this.fistName = fistName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDomisili() {
    return domisili;
  }

  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  // METHODS
  public String getFullName() {
    return this.fistName + " " + this.lastName;
  }
}
