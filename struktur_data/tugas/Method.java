public class Method {

    public static void main(String[] args) {
        System.out.println("Method");
        System.out.println("-------");
        int i=100;
        int j=200;
    // Panggil Method
        int k=minimum(i, j);
        System.out.println("Nilai minimum dari " +i+ " dan " +j+ " adalah : " +k);
    }

    // Buat Method
    public static int minimum(int a, int b) {
        int result;
            if(a<b){
                result=a;
            }
            else{
                result=b;
            }
    // Nilai yang dikembalikan
        return result;
    }

}
