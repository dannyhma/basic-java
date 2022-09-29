public class DiskusiString {
    public static void main(String[] args) {
        String awal = "Hello World Hello Java";
        System.out.println("String awal : "+awal+"\n");

        // length
        System.out.println("Jumlah kata pada string awal : "+awal.length()+"\n");

        // substring
        String sub = awal.substring(12, 22);
        System.out.println("Substring   : "+sub+"\n");

        // toLowerCase
        String lower = awal.toLowerCase();
        System.out.println("toLowerCase : "+lower+"\n");

        // toUpperCase
        String upper = awal.toUpperCase();
        System.out.println("toUpperCase : "+upper+"\n");

        // replace
        String rep = new String(sub);
        System.out.println("Replace kata v ke p : "+rep.replace('v', 'p')+"\n");

        // replacefirst
        String first = new String(sub);
        String newfirst = first.replaceFirst("Hello", "HELLO");
        System.out.println("Replacefirst : "+newfirst+"\n");

        // replaceall
        String all = new String(sub);
        String newall = all.replaceAll("Hello(.*)", "All In One");
        System.out.println("Replaceall : "+newall+"\n");

   }
}
