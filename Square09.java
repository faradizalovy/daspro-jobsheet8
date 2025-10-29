import  java.util.Scanner;

public class Square09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
    }
        System.out.println();
}
}   
}

/*PERTANYAAN */

/*1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, 
apa yang akibatnya? Mengapa bisa demikian?  */
/*Jawaban: Maka perulangan luar akan berjalan sebanyak N+1 kali, sehingga baris bintang yang dicetak 
menjadi lebih banyak satu.*/

/*2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam,
Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian? */
/*Jawaban: Jika inisialisasi i = 1 diubah menjadi i = 0, maka jumlah bintang dalam satu baris akan bertambah satu.
Hal ini terjadi karena perulangan dimulai dari 0 hingga N, sehingga total iterasinya menjadi N + 1 kali. 
Akibatnya, setiap baris menampilkan satu bintang lebih banyak dari seharusnya*/

/*3. Jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya? */
/*Jawaban: Perulangan luar (outer loop) berfungsi untuk mengatur jumlah baris yang akan dicetak. Sedangkan 
perulangan dalam (inner loop) berfungsi untuk mengatur jumlah bintang dalam setiap baris. Jadi, setiap satu 
kali perulangan luar dijalankan, perulangan dalam akan mencetak bintang sebanyak N kali sebelum pindah ke 
baris berikutnya */

/*4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika 
sintaks tersebut dihilangkan? */
/*Jawaban: System.out.println(); berfungsi untuk menambah baris baru setelah setiap perulangan dalam selesai. 
Jika dihapus, semua bintang akan tercetak dalam satu baris tanpa pindah ke baris berikutnya. */