import java.util.Scanner;

public class If {

    public static void main(String[] args) {   
        int usia;
        String anda = "Status Usia Anda : ";
        Scanner input = new Scanner(System.in);

        System.out.print("Tulis Usia : ");
        usia = input.nextInt();
        
        if (usia <= 10){
            System.out.println(anda + "Anak-Anak");
        }
        else if (usia <= 18){
            System.out.println(anda + "Remaja");
        }
        else if (usia <= 35){
            System.out.println(anda + "Dewasa");
        }
        else if (usia <= 65){
            System.out.println(anda + "Parubaya");
        }
        else{
            System.out.println(anda + "Tua");
        }
        
    }
    
}
