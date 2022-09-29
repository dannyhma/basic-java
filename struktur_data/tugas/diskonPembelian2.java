import java.util.Scanner;

public class diskonPembelian2 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        int harga,jumlah, total, diskon;
        
        System.out.print("Masukkan Harga Barang : ");
        harga = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang : ");
        jumlah = sc.nextInt();

        total = jumlah * harga;
        
        if (total >= 200000) {
            diskon = total *  15 / 100;
            total = total - diskon;
            System.out.println("Diskon = 15%\n" +total);
        }else if(total >= 100000) {
            diskon = total * 10 / 100;
            total = total - diskon;
            System.out.println("Diskon = 10%\n");
            
        }else if(total >= 50000){
            diskon = total * 5 / 100;
            total = total - diskon;
            System.out.println("Diskon = 5%\n");
        }
        
        if (jumlah >= 50){
            diskon = total - ((total *5) / 100 );
            System.out.println("Tambahan Diskon 5%\n Total Bayar = " +total);
        }
        else{
            System.out.println("Total Bayar = "+total);
        }
        
    }

}
