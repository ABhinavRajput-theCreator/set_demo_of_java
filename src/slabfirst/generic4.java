package slabfirst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class generic4 {


    void fun2()
    {
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(123);
        ls.add(456);
        ls.add(758);
        ls.add(6987);

        System.out.println(ls);
        System.out.println("no of items:"+ls.size());
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);


    }
    public static void main(String args[]){
        generic4 a=new generic4();
        a.fun2();
    }




}
