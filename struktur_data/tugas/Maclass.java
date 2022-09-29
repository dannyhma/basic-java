public class Maclass {
    
    public static void main(String[] args) {

        // buat object dari class laptop (instansiasi)
        Laptop laptopGaming = new Laptop();
        
        // set nilai property object laptop
        laptopGaming.pemilik = "Danny";
        laptopGaming.merk = "Asus ROG";
        laptopGaming.ukuranLayar = 15.6;
        laptopGaming.harga = 15000000;

        // panggil method pada object laptop
        System.out.println("Print out dari laptop : ");
        System.out.println("-------------------------");
        laptopGaming.infoLaptop();
        laptopGaming.hidupkanLaptop();
        laptopGaming.restartLaptop();
        laptopGaming.matikanLaptop();
    }
}
