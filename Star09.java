import java.util.Scanner;

public class Star09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
    }
}
}

/*PERTANYAAN */

/*1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?*/
/*Jawaban: Output akan menampilkan jumlah bintang lebih banyak satu dari nilai N. Hal ini karena perulangan 
dimulai dari 0 hingga N, sehingga jumlah iterasi menjadi N+1 kali.*/

/*2. Jika pada perulangan for, kondisi i <= N diubah menjadi i > N, apa akibatnya? Mengapa bisa demikian?*/
/*Jawaban: Perulangan tidak akan berjalan sama sekali, karena kondisi awal i (yang lebih kecil dari N) 
sudah tidak memenuhi i > N. Akibatnya, tidak ada output bintang yang dicetak. */

/*3. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian? */
/*Jawaban: Program akan mengalami infinite loop (perulangan tak berujung) karena nilai i terus berkurang 
dan tidak pernah mencapai kondisi berhenti (i <= N) */