import java.util.Scanner;
public class ModifikasiNo4ArrayNilai29 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 66){
                System.out.println("Mahasiswa ke-"+i+" LULUS!");
            }
         }
         for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] < 68){
                System.out.println("Mahasiswa ke-"+i+" TIDAK LULUS!");
            }
        }    
    }
}