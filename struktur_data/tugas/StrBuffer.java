public class StrBuffer {

    public static void main(String[] args) {
        int a = 30;
        int b = 25;
        float c = 9;
        float d = 6;
        double e = 12;
        double f = 14;

    //  Method max
        int imax = Math.max(a, b);
        float fmax =  Math.max(c, d);
        System.out.println("<----Method max---->");
        System.out.println("Int max : "+imax);
        System.out.println("Float max : "+fmax);
        System.out.println();

    //  Method min
        float fmin = Math.min(c, d);
        double dmin = Math.min(e, f);
        System.out.println("<----Method min---->");
        System.out.println("Float min : "+fmin);
        System.out.println("Double min : "+dmin);
        System.out.println();        

    }
}