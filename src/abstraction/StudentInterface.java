package abstraction;

public interface StudentInterface {
  // abstract methods wajib yang tanpa body
  public String registration();

  // abstract methods yg sifat opsional dan bisa ditambahkan body / proses di
  // dalamnya
  default void createStudent() {

  }
}
