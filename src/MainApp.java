import inheritance.Person;
import inheritance.Student;

public class MainApp {
  public static void main(String[] args) {
    // INSTANSIASI OBJEK
    Person amalia = new Person("12345");
    amalia.setFistName("Amalia");
    amalia.setLastName("Fatimah");
    amalia.setDomisili("Jakarta");
    amalia.setBirthYear(1999);

    Person budi = new Person();
    budi.setFistName("Budi");
    budi.setLastName("Raharja");
    budi.setDomisili("Bangka Belitung");
    budi.setBirthYear(1945);

    // Student
    Student rina = new Student();
    rina.setFistName("Rina");
    rina.setLastName("Sarasvati");
    rina.setSks(20);
    rina.setCourseName("Tugas Akhir");

    // OUTPUT
    System.out.println("=========== DATA DIRI ===========");
    System.out.println(amalia.getFullName());
    System.out.println(amalia.getIdCard());
    System.out.println(amalia.getDomisili());
    System.out.println(amalia.getBirthYear());

    System.out.println("=========== DATA DIRI ===========");
    System.out.println(budi.getFullName());
    System.out.println(budi.getIdCard());
    System.out.println(budi.getDomisili());
    System.out.println(budi.getBirthYear());

    System.out.println("=========== DATA DIRI STUDENT ===========");
    System.out.println(rina.getFullName());
    System.out.println(rina.getSks());
    System.out.println(rina.getCourseName());
  }
}
