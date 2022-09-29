import java.util.Scanner;

public class ujikendaraan{

    public static String ujiemisi(int HC){
        if(HC>200){
            return "Tidak Lolos";
        }
        else{
            return "Lolos";
        }
    }

    public static void main(String[] args){
        int HC;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Uji : ");
        HC = input.nextInt();

        System.out.println(ujiemisi(HC));
    }

}