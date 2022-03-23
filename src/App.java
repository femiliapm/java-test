public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // INSTANSIASI OBJEK / PEMANGGILAN OBJEK
        Person person = new Person();
        // person.firstName = "Ajeng";
        person.setFirstName("Femilia");
        person.lastName = "Putri";
        person.setDomisili("Bogor");

        // Biodata Diri
        System.out.println("BIODATA DIRI");
        person.getFullname();
        System.out.println("Domisili : " + person.getDomisili());
    }
}

class Person {
    private String firstName;
    String lastName;
    private String domisili;

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getDomisili() {
        return this.domisili;
    }

    public void setFirstName(String namaDepan) {
        this.firstName = namaDepan;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void getFullname() {
        System.out.println("Nama Lengkap : " + firstName + " " + lastName);
    }

}
