import java.util.Scanner;

public class Looping{
    
    public static void main(String[] args) {
        System.out.println("Macam-Macam Looping : \n");

        // for (cetak bilangan ganjil)
        System.out.println("1. For : \n");
        for(int a = 1; a <= 10 ; a += 2){
            System.out.println(a + " ");
        }

        // while
        System.out.println("\n2. while : \n");
        int b = 1;
        while(b <= 3){
            System.out.println("Perulangan While ke-" + b);
            b++;
        }

        // dowhile (cetak bilangan genap)
        System.out.println("\n3. dowhile : \n");
        int c = 0;
        do {
            System.out.println(c + " "); 
            c += 2;   
        } while (c <= 10);

    }   

}
