class nilai {    
    private int nilaiSaya;    
    public String Nama;
    public String NIM;
        
    public void setNilai (int nilai) {
        nilaiSaya=nilai;
    }
    
    public int getNilai() {
        return nilaiSaya;
    }
}

public class testNilai {

    public static void main(String[] args) {
        
        nilai Biodata = new nilai();
        Biodata.Nama = "Danny Himawan";
        Biodata.NIM = "041632438";
        Biodata.setNilai(100);
        System.out.println("Nama  = "+ Biodata.Nama);
        System.out.println("NIM   = "+ Biodata.NIM);
        System.out.println("Nilai = "+ Biodata.getNilai());
        
    }
}