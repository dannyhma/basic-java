public class Laptop{
    
    // deklarasi tipe data dan property
    String pemilik, merk, on, restart, off;
    double ukuranLayar;
    int harga;

    // deklarasi method property laptop
    void infoLaptop(){
        System.out.println("Pemilik Laptop : "+pemilik);
        System.out.println("Merek Laptop : "+merk);
        System.out.println("Ukuran Layar Laptop : "+ukuranLayar);
        System.out.println("Harga Laptop : "+"Rp "+harga);
    }

    // deklarasi method untuk class laptop
    void hidupkanLaptop(){
        on = "Menghidupkan Laptop";
        System.out.println(on+" "+merk+" milik "+pemilik);
    }
    
    void restartLaptop(){
        restart = "Merestart Laptop";
        System.out.println(restart+" "+merk+" milik "+pemilik);
    }

    void matikanLaptop(){
        off = "Mematikan Laptop";
        System.out.println(off+" "+merk+" milik "+pemilik);
    }
}
