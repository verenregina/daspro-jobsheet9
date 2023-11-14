import java.util.Scanner;
public class ModifikasiNo2LinearSearch29 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array :");
        int jumlahElemen = scan.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i= 0; i < jumlahElemen; i++)
        {
            System.out.println("Masukkan elemen array ke-"+i+": ");
            arrayInt[i] = scan.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari : ");
        int key = scan.nextInt();
        
        int hasil = -1;

        for (int i = 0; i <jumlahElemen; i++) {
            if(arrayInt[i] == key){
                hasil = i;
                break;
            }
        }

        if (hasil != -1){
            System.out.println("Key ditemukan pada indeks"+ hasil);
        }else {
            System.out.println("Key tidak ditemukan dalam array");
        
        }
    }
}
    
