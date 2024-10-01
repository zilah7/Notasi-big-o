import java.util.Scanner;

public class tugas {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan angka: ");
        int angka = scanner.nextInt();
        int hasil = 1;
        for(int i = 0; i < 2 ; i++){
             hasil *= angka;
        }
        System.out.println("pangkat dua dari " + angka + "adalah : " + hasil);
    }

}