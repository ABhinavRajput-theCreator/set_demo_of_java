package Slecscnd;

import java.util.*;

public class listexmple {
    void funcfirst(){
        List ls = new ArrayList();

        ls.add("coke");
        ls.add("Pepsi");

        ls.add("500");
        ls.add("5.6");
        ls.add("500");

        ls.add("perk");
        ls.add("fruti");


        System.out.println(ls);
        System.out.println("no of item: "+ls.size());
        System.out.println("\n\n\n...............");

        System.out.println(ls.get(2));
        ls.set(1,"Limica");
        ls.add(2,"Limica");

        ls.remove("Fruti");
//        ls.clear();

        System.out.println(ls);
        System.out.println("no of item :"+ls.size());

    }


    public static void main (String args[]){
        listexmple obj = new listexmple();
        obj.funcfirst();
    }


}
