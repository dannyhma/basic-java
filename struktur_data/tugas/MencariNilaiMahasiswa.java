import java.util.Scanner;

public class MencariNilaiMahasiswa {

    public static void main(String[] args) {
        String nim,nama,grade;
        int n1,n2,n3,hadir;
        double m1,m2,m3,mm;
                
        System.out.println("PROGRAM HITUNG NILAI AKHIR DAN GRADE MAHASISWA");       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Mahasiswa : " );
        nama = input.nextLine();
        
        System.out.print("Nim Mahasiswa : ");
        nim = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        n1 = input.nextInt();
        
        System.out.print("Nilai UTS : ");
        n2 = input.nextInt();
        
        System.out.print("Nilai UAS : ");
        n3 = input.nextInt();  
        
            if(n1 <3){
                hadir=0;
                m1 = 0.2 * hadir;
            }
            else if(n1 >=3 && n1 <=4){
                hadir=60;
                m1 = 0.2 * hadir;
            }
            else if(n1 >=5 && n1 <=6){
                hadir=80;
                m1 = 0.2 * hadir;
            }
            else{
                hadir=100;
                m1 = 0.2 * hadir;
            }

        m2= 0.3 * n2;
        m3= 0.5 * n3;
        mm= m1+m2+m3;
                        
            if(mm >=85 && mm <=100){
            grade= "A" ;
            }
            else if (mm >=70 && mm <=84){
            grade= "B" ;
            }        
            else if (mm >=60 && mm <=69){
            grade= "C" ;
            }
            else if (mm >=50 && mm <=59){
            grade= "D" ;
            }
            else if (mm <49){
            grade= "E" ;
            }
            else{
                grade= "Input Nilai Sesuai Aturan!";
            }
               
        System.out.println("Mahasiswa Yang Bernama : " +nama+ ", Dan Nim : " +nim);
        System.out.println("Dengan Nilai Persentasi Yang Dihasilkan : " );
        System.out.println("Nilai Kehadiran * 20% : " +m1);
        System.out.println ("Nilai UTS * 30% : " +m2 );
        System.out.println("Nilai UAS * 50% : " +m3 );
                
        System.out.println("Jadi Mahasiswa Yang Bernama : " +nama+ ", Dan Nim : " +nim);
        System.out.println("Memperoleh Nilai Akhir Sebesar : " +mm);
        System.out.println("Grade Nilai Yang Didapat Adalah : " +grade);
        
    }

}