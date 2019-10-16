package Slecscnd;

import java.util.*;


public class setdemo {
    void func(){
        Set st = new HashSet();
        st.add("Coke");
        st.add("Pepsi");
        st.add("500");
        st.add("Scale");
        st.add("500");              //Duplicate entry will not be added in the set.


//        if(st.isEmpty())
//        {
//            System.out.println("Trolly free hai.");
//        }
//        else
//        {
//            System.out.println(st);
//            System.out.println("no of item : "+st.size());
//        }

        if (st.contains("toffie"))
        {
            System.out.println("Found");
            System.out.println(st);
            System.out.println("no of items :"+st.size());
        }
        else{
            System.out.println("not found");
        }



    }
    public static void main (String args[]){
            setdemo obj = new setdemo();
            obj.func();
    }
}
