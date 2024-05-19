package Collections;

import java.util.Hashtable;

public class HashtableTest {

    public static void main(String[] args) {

        Hashtable h = new Hashtable(25);

        h.put(new Temp1(5),"A");
        h.put(new Temp1(2),"B");
        h.put(new Temp1(6),"C");
        h.put(new Temp1(15),"D");
        h.put(new Temp1(23),"E");
        h.put(new Temp1(16),"F");
//      h.put("durga", null);       // NullPointerException

        System.out.println(h);
    }
}


class Temp1{

    int i;

    Temp1(int i){
        this.i = i ;
    }

    public int hashCode(){
        return i;
    }

    public String toString(){
        return i+"";
    }
}


// i    --- {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
// i%9; --- {16=F, 15=D, 6=C, 23=E, 5=A, 2=B}

// i &  intialcapacity = 25 ---  {23=E, 16=F, 15=D, 6=C, 5=A, 2=B}