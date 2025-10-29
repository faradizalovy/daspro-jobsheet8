import java.util.Scanner;

public class Triangle09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
        System.out.println();
        i++;
        }
    }
    
}

/*PERTANYAAN */

/*1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan berikut? */
/*Jawaban: Output program masih tidak sesuai dengan bentuk segitiga bintang yang diharapkan karena hasilnya 
belum berpindah baris setiap kali satu baris bintang selesai dicetak. Hal ini disebabkan oleh tidak adanya 
perintah System.out.println(); di luar perulangan dalam. */

/*2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu 
diperbaiki/ditambahkan. */
/*Jawaban: Bagian yang perlu diperbaiki adalah menambahkan perintah System.out.println(); di luar perulangan 
dalam agar setiap baris bintang berpindah ke baris baru, serta mengubah nilai awal variabel i menjadi 1 supaya 
baris pertama langsung mencetak satu bintang. Dengan perbaikan tersebut, hasil output sudah sesuai dengan bentuk 
segitiga seperti pada contoh jobsheet. */