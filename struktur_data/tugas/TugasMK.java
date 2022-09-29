import java.util.Scanner;

public class TugasMK{

  static void NewMatriks(){
    System.out.println("Mencari Matriks Transpose : ");
    System.out.println("----------------------------");

      int i, j, m, n;
      int matriks[][] = new int[10][10]; 
      int transpose[][] = new int[10][10];
          
          Scanner scan = new Scanner(System.in);
          System.out.print("Masukkan jumlah baris matriks : ");
          m = scan.nextInt();

          System.out.print("Masukkan jumlah kolom matriks : ");
          n = scan.nextInt();

            for(i = 0; i < m; i++){
              for(j = 0; j< n; j++){
                System.out.print("Masukkan elemen matriks baris ke " +i+ " kolom ke " +j+ " : ");
                matriks[i][j] = scan.nextInt();
              }
            }

            for(i = 0; i < m; i++){
              for(j = 0; j< n; j++){
                transpose[j][i] = matriks[i][j];
              }
            }
          
          System.out.println("Hasil matriks : ");
            for(i = 0; i < m; i++){
              for(j = 0; j < n; j++){
                System.out.print(matriks[i][j] + "\t");
              }
              System.out.println();
            }

          System.out.println("Hasil transpose matriks : ");
            for(i = 0; i < n; i++){
              for(j = 0; j< m; j++){
                System.out.print(transpose[i][j] + "\t");
              }
              System.out.println();
            }
          
    }

    static void NewLuas(){
      System.out.println("Mencari Luas Persegi Panjang : ");
      System.out.println("-------------------------------");

      Scanner scan = new Scanner(System.in);
        int panjang, lebar, luas;  
          System.out.print("Masukkan Panjang : ");
          panjang = scan.nextInt();
          System.out.print("Masukkan Lebar   : ");
          lebar = scan.nextInt();
      
          luas = panjang*lebar;

      System.out.println("Luas Persegi Panjang : "+luas);
      
    }

    public static void main(String[] args) {
      System.out.println("Menu : ");
      System.out.println("--------------------------------");
      System.out.println("[1] Matriks Transpose");
      System.out.println("[2] Mencari Luas Persegi Panjang");
      System.out.println("[3] Selesai");
      System.out.println("--------------------------------");
      
      Scanner scan = new Scanner(System.in);

        int pilih;
        System.out.print("Pilihan [1/2/3] : ");
        pilih = scan.nextInt();
        System.out.println("");
        
        if (pilih==1){
          NewMatriks();
        }

        else if (pilih==2){
          NewLuas();
        }

        else{
          System.out.println("-Anda Sudah Keluar Dari Program-");
        }
        
    }
  
}