public class MethodString {
    
    public static void main(String[] args) {
        String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
            System.out.println("String awal : "+awal);

                // String No 1
                String satu = awal.substring(0, 36);
                System.out.println("String No 1 : "+satu);

                // String No 2
                String dua = satu.toLowerCase();;
                System.out.println("String No 2 : "+dua);

                // // String No 3
                String tiga = satu.toUpperCase();
                System.out.println("String No 3 : "+tiga);  
                                
                // String No 4
                StringBuffer empat = new StringBuffer(satu);
                empat.delete(0, 25);
                System.out.println("String No 4 : "+empat); 

                // String No 5
                StringBuffer lima = new StringBuffer(awal);
                lima.delete(0, 37);
                System.out.println("String No 5 : "+lima); 

    }

}