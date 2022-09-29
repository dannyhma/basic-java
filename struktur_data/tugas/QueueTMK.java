import java.util.List;
import java.util.ArrayList;

public class QueueTMK{
    public static void main(String[] args) {

        List elemen = new ArrayList();
        elemen.add("I");
        elemen.add("N");
        elemen.add("F");
        elemen.add("O");
        elemen.add("R");
        elemen.add("M");
        elemen.add("A");
        elemen.add("S");
        elemen.add("I");
        // hapus data pada antrian pertama
        elemen.remove(0);
        elemen.remove(0);
        elemen.remove(0);
        // hapus data pada antrian ketiga
        elemen.remove(2);

        for(Object queueList : elemen){
            System.out.print(queueList+"-->");
        }

    }
}