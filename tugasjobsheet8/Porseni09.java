package tugasjobsheet8;

import java.util.Scanner;
public class Porseni09 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
     int jumlahPoltek = sc.nextInt();
     sc.nextLine();
     String semuaData = "";

     System.out.println("\n=== MEMASUKKAN DATA ATLET ===");
    
     for (int i = 1 ; i <= jumlahPoltek; i++) {
        semuaData += "\n=== Politeknik ke-" + i + " ===\n";
        System.out.println("\n=== Politeknik ke-" + i + " ===");

        System.out.println("Cabang Badminton: ");
        semuaData += "Cabang Badminton\n";
            for (int a = 1; a <= 5; a++) {
            System.out.print("Nama atlet ke-" + a + ": ");
            String nama = sc.nextLine();
            semuaData += "Atlet ke-" + a + ": " + nama + "\n";
        }
        System.out.println("\nCabang Tenis Meja: ");
        semuaData += "\nCabang Tenis Meja\n";
        for (int b = 1; b <= 5; b++) {
        System.out.print("Nama atlet ke-" + b + ": ");
        String nama = sc.nextLine();
        semuaData += "Atlet ke-" + b + ": " + nama + "\n";
        }
        System.out.println("\nCabang Basket:");
        semuaData += "\nCabang Basket\n";
        for (int c = 1; c <= 5; c++) {
            System.out.print("Nama atlet ke-" + c + ": ");
        String nama = sc.nextLine();
        semuaData += "Atlet ke-" + c + ": " + nama + "\n";
        }
        System.out.println("\nCabang Bola Voli:");
        semuaData += "\nCabang Bola Voli\n";
        for (int d = 1; d <= 5; d++) {
        System.out.print("Nama atlet ke-" + d + ": ");
        String nama = sc.nextLine();
        semuaData += "Atlet ke-" + d + ": " + nama + "\n";
        }
    }

        System.out.println("\n=== INFORMASI NAMA ATLET ===");
        System.out.println(semuaData);
            System.out.println("\n=== Semua Data Atlet Telah Ditampilkan ===");
            System.out.println();
    }
}
