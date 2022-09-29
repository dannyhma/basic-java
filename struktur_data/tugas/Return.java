public class Return {
    
    // deklarasi tipe data dan property
    String hewan = "Sapi";
    int kandang1 = 20, kandang2 = 100, hasil;
    
    public static void main(String[] args){
        // membuat objek dari class return
        Return data = new Return();
        System.out.println("Jenis Hewan : "+data.jenis());
        System.out.println("Jumlahnya : "+data.Jumlah()+ " Ekor");
    }
    
    String jenis(){
        //mengembalikan nilai hewan
        return hewan;
    }
    
    int Jumlah(){
        hasil = kandang1 + kandang2;
        return hasil; //mengembalikan nilai dari hasil
    }

}