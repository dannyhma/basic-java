public class Void {

    // deklarasi tipe data dan property
    String nama, makanan;

    // deklarasi method untuk class Void
    void Kucing(){
        nama = "Naruto";
        makanan = "Daging";
        System.out.println("Nama Kucing Saya Adalah "+nama);
        System.out.println("Kucing Saya Suka Makan "+makanan);
    }
    
    // deklarasi method untuk class Void
    void Kelinci(){
        nama = "Sasuke";
        makanan = "Wortel";
        System.out.println("Nama Kelinci Saya Adalah "+nama);
        System.out.println("Kelinci Saya Suka Makan "+makanan);
    }
    
    public static void main(String[] args){
        // membuat objek dari class Void
        Void Hewan = new Void();
        System.out.println("====== KUCING =======");
        Hewan.Kucing(); // panggil method pada object Void
            System.out.println("\n");
        System.out.println("====== KELINCI ======");
        Hewan.Kelinci(); // panggil method pada object Void
            System.out.println("\n");
    }

}