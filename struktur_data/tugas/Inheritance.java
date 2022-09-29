class Komputer {

    String processor = "Intel Core i9";
    String cekKomputer(){ 
          return "Ini berasal dari class Komputer"; 
    }

};
       
class Notebook extends Komputer {

    String merk = "Asus"; 
    String cekNotebook(){ 
        return "Ini berasal dari class Notebook"; 
    }
    
};
       
public class Inheritance{

    public static void main(String args[]){

          Notebook notebookAndi = new Notebook();
           
          System.out.println(notebookAndi.processor);
          System.out.println(notebookAndi.merk);
          System.out.println(notebookAndi.cekKomputer());
          System.out.println(notebookAndi.cekNotebook());

    }

}