public class Array{
    
    public static void main(String[] args) {
    
    // Array 1 dimensi
    System.out.println("Array 1 dimensi");
    System.out.println("---------------");
    String buah[] = {"Anggur","Jeruk","Apel","Pisang","Pepaya"};    
            for(int i=0; i<5; i++){
                System.out.println(buah[i]);
                System.out.println();
            }
    
    // Array 2 dimensi
    System.out.println("Array 2 dimensi");
    System.out.println("---------------");
    String alat[][] = {{"Buku","Pena","Pensil","Penghapus"},
                       {"3.000","3.000","1.000","1.000"}};
            for(int i=0; i<alat.length; i++){
                for(int j=0; j<alat[i].length; j++){
                    System.out.print(alat[i][j]+ "\t");
                }
                    System.out.println();
            }

    // Array 3 dimensi
    System.out.println("\n"+"Array 3 dimensi");
    System.out.println("---------------"); 
    int z[][][] = {{{2,4,6,8},{3,6,9,12},{4,8,12,16}}, 
                   {{5,10,15,20},{6,12,18,24},{7,14,21,28}}};
            for(int i=0; i<2; i++){
                for(int j=0; j<3; j++){
                    for(int k=0; k<4; k++){
                        System.out.print(z[i][j][k]+ "\t");
                    }
                        System.out.println(" ");
                }
            }

    }    

}