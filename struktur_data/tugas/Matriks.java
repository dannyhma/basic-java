import java.util.Arrays;

public class Matriks {
    
    public static void main(String[] args) {

        System.out.println("Matriks A : ");

        int matriksA[][] = {{1,2,4},
                            {3,7,2},
                            {5,8,4}};

        for (int i = 0; i < matriksA.length; i++){
            for (int j = 0; j < matriksA[0].length; j++){
                    System.out.print(matriksA[i][j] + "     ");
                }
            System.out.println();
        }

        System.out.println("Matriks B : ");
        
        int matriksB[][] = {{1,2,2},
                            {2,2,1},
                            {1,1,1}};

        for (int i = 0; i < matriksB.length; i++){
            for (int j = 0; j < matriksB[0].length; j++){
                    System.out.print(matriksB[i][j] + "     ");
                }
            System.out.println();
        }

        System.out.println("Matriks C : ");
        
        int matriksC[][] = {{11,14,12},
                            {12,45,30},
                            {23,45,12}};

        for (int i = 0; i < matriksC.length; i++){
            for (int j = 0; j < matriksC[0].length; j++){
                    System.out.print(matriksC[i][j] + "    ");
                }
            System.out.println();
        }
                   
        System.out.println("Matriks D : ");
        int matriksD[][] = new int [3][9];
        matriksD[0][0] = matriksA[0][0];
        matriksD[0][1] = matriksA[0][1];
        matriksD[0][2] = matriksA[0][2];
        matriksD[0][3] = matriksA[1][0];
        matriksD[0][4] = matriksA[1][1];
        matriksD[0][5] = matriksA[1][2];
        matriksD[0][6] = matriksA[2][0];
        matriksD[0][7] = matriksA[2][1];
        matriksD[0][8] = matriksA[2][2];

        matriksD[1][0] = matriksB[0][0];
        matriksD[1][1] = matriksB[0][1];
        matriksD[1][2] = matriksB[0][2];
        matriksD[1][3] = matriksB[1][0];
        matriksD[1][4] = matriksB[1][1];
        matriksD[1][5] = matriksB[1][2];
        matriksD[1][6] = matriksB[2][0];
        matriksD[1][7] = matriksB[2][1];
        matriksD[1][8] = matriksB[2][2];

        matriksD[2][0] = matriksC[0][0];
        matriksD[2][1] = matriksC[0][1];
        matriksD[2][2] = matriksC[0][2];
        matriksD[2][3] = matriksC[1][0];
        matriksD[2][4] = matriksC[1][1];
        matriksD[2][5] = matriksC[1][2];
        matriksD[2][6] = matriksC[2][0];
        matriksD[2][7] = matriksC[2][1];
        matriksD[2][8] = matriksC[2][2];

        for (int i = 0; i < matriksD.length; i++){
            for (int j = 0; j < matriksD[0].length; j++){
                    System.out.print(matriksD[i][j] + "\t");
                }
            System.out.println();
        }            

    }
    
}
