import java.util.List;
import java.util.LinkedList;

public class StackTMK{
    public static void main(String[] args) {

        LinkedList stack = new LinkedList();
        stack.add("I");
        stack.add("N");
        stack.add("F");
        stack.add("O");
        stack.add("R");
        stack.add("M");
        stack.add("A");
        stack.add("S");
        stack.add("I");
        stack.add(2, "P");
        stack.remove(3);
        stack.add(3, "R");
        stack.remove(5);
        stack.add(5, "D");
        stack.remove(6);
        stack.add(6, "I");
        stack.remove(7);

        for(Object stackList : stack){
            System.out.print(stackList+"-->");
        }

    }
}