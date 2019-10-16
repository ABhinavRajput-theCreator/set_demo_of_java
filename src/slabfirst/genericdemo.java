package slabfirst;
import java.util.*;
public class genericdemo {

    void funcs(){
        List<String> ls =new ArrayList<String>();
        ls.add("Pepsi");
        ls.add("Magii");
//        ls.add(10);       //It is restricted.Only accpet string bcoz of <String>.
        System.out.println(ls);
        System.out.println("items "+ls.size());
    }

    public static void main(String[] args) {
        genericdemo obj=new genericdemo();
        obj.funcs();
    }
}
