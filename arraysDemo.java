public class arraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Sevval";
        ogrenciler[1] = "Ahmet";
        ogrenciler[2] = "Mehmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
