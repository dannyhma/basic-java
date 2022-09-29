public class Tanaman {

}

// Tugas 1 Struktu Data
// Java Untuk Pemula
class Sayuran {
    String sayur1;
    String sayur2;
    String sayur3;
    String sayur4;

     public static void main(String[] args) throws Exception {
        Sayuran tanamsayuran = new Sayuran();   
        tanamsayuran.sayur1 = "Kol";
        tanamsayuran.sayur2 = "Terong";
        tanamsayuran.sayur3 = "Sawi";
        tanamsayuran.sayur4 = "Cabe";

        System.out.println("Sayuran : ");
        System.out.println(tanamsayuran.sayur1);
        System.out.println(tanamsayuran.sayur2);
        System.out.println(tanamsayuran.sayur3);
        System.out.println(tanamsayuran.sayur4);
            
    }
}

class Buahan {
    String buah1;
    String buah2;
    String buah3;
    
     public static void main(String[] args) throws Exception {
        Buahan tanambuahan = new Buahan();   
        tanambuahan.buah1 = "Lengkeng";
        tanambuahan.buah2 = "Mangga";
        tanambuahan.buah3 = "Rambutan";
    
        System.out.println("Buahan : ");
        System.out.println(tanambuahan.buah1);
        System.out.println(tanambuahan.buah2);
        System.out.println(tanambuahan.buah3);
     
    }
}
