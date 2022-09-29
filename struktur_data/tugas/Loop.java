public class Loop {
    
    public static void main(String[] args) {

        // Loop 1

        for(int a=9; a>=1; a--){           
            System.out.print(a);
        }      
        System.out.println();
        
        for(int b=1; b<=9; b++){
            for(int c=1; c<=9; c++){
                if (c!=b){
                    System.out.print("*");
                }

                else{
                    break;
                }

            }
            
            if(b<5){
                System.out.print(1);
            }

            else{
                System.out.print(b);
            }

            System.out.println();
        }

        for(int d=1; d<=9; d++){           
            System.out.print(d);
        } 
        
        System.out.println("\n");

        // Loop 2

        // int i,x,y;

        // for(i=1; i<10; i++){
        //     System.out.print(i);

        //     if (i==9){
        //         System.out.println();
        //         for(x=1; x<5; x++){
        //             y=1;
        //             while(y<x){
        //                 System.out.print("*");
        //                 y++;
        //             }
        //             System.out.println(1);
        //         }   
        //         for(x=5; x<10; x++){
        //             y=1;
        //             while (y<x) {
        //                 System.out.print("*");
        //                 y++;
        //             }
        //             System.out.println(x);
        //         }
        //     }
        // }
        // for(i=9; i>0; i--){
        //     System.out.print(i);
        // }

        // Loop 3

        int i,x,y;

        for(i=9; i>0; i--){
            System.out.print(i);

            if (i==1){
                System.out.println();
                for(x=1; x<5; x++){
                    y=1;
                    while(y<x){
                        System.out.print("*");
                        y++;
                    }
                    System.out.println(1);
                }   
                for(x=5; x<10; x++){
                    y=1;
                    while (y<x) {
                        System.out.print("*");
                        y++;
                    }
                    System.out.println(x);
                }
            }
        }

        for(i=1; i<10; i++){
            System.out.print(i);
        }
            
    }
          
}