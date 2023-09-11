package overriding;

class ParentClass{
    public void demo(int a,int b){
        System.out.println(a+b);

    }
}
public class AccessModifierTest extends ParentClass{

     public void demo(int a, int c){
        System.out.println((a+c)/2);

    }
    public static void main(String[] args) {
         AccessModifierTest o = new AccessModifierTest();
         o.demo(10,5);

    }
}
