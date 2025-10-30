import java.util.Scanner;

public class RataNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int i,j;
        float nilai, totalNilai, rataNilai;

        i = 1; //inisialisasi mahasiswa pertama

        //outer loop (while) 
        while (i <= 5) {
            System.out.println("\nInput nilai mahasiswa ke-" + i);
            totalNilai = 0; //reset total setiap mahasiswa

            //inner loop (for)
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" +j + " = ");
                nilai = sc.nextFloat();
                totalNilai = totalNilai + nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke-" +i + " = " +rataNilai);

            i++; //lanjut ke mahasiswa berikutnya
        }

    }
}