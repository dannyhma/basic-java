import java.util.Scanner;

public class diskonPembelian {

    public static void main(String[] args) {
    
        int harga, diskon, hargaTotal;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah pembelian anda : Rp ");
        harga = input.nextInt();

            if (harga > 50000){
                diskon = harga*20/100;
                hargaTotal = harga-diskon;
                System.out.println("Selamat anda mendapatkan diskon 20%");    
            }

            else{
                hargaTotal = harga;
            }
        
        System.out.println("Total pembelian yang harus dibayarkan : Rp "+hargaTotal);

    }  

}