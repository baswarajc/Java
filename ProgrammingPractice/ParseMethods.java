package ProgrammingPractice;

// parseInt(): The method generally used to convert String to Integer in Java is parseInt().
//parseDouble()


public class ParseMethods {

    public static void main(String[] args) {

        String s = "10";

        int a = Integer.parseInt(s);
        System.out.println(a);  //10

        double b = Double.parseDouble(s);
        System.out.println(b);  //10.0

        float c = Float.parseFloat("12.255");
        System.out.println(c);   //12.255

        float d = Float.parseFloat(s);
        System.out.println(d);   //10.0

    }


}
