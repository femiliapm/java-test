public class Biodata {
  public static void main(String[] args) {
    String firstName, lastName, birthPlace, progLangFav;
    int birthYear;

    firstName = "Femil";
    lastName = "Putri";
    birthPlace = "Bogor";
    progLangFav = "Java";
    birthYear = 2022;

    System.out.println("=========== BIODATA ===========");
    System.out.println("Nama Lengkap : " + firstName + " " + lastName);
    System.out.println("Tempat Lahir : " + birthPlace);
    System.out.println("Tahun Lahir : " + birthYear);
    System.out.println("Bahasa Pemrograman Favorite : " + progLangFav);
  }
}