package slabfirst;

import java.util.*;
import java.lang.*;


public class generic2 {


    void fun1()
    {
        List <String>ls=new ArrayList<String>();
        ls.add("coke");
        ls.add("pepsi");
        ls.add("coke");

        ls.add("fruti");

        System.out.println(ls);
        System.out.println("no of items:"+ls.size());
        Collections.sort(ls);
        System.out.println(ls);


    }
    public static void main(String args[]){
        generic2 a=new generic2();
        a.fun1();
    }


}
