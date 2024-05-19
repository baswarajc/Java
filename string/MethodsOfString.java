package string;

public class MethodsOfString {

    public static void main(String[] args) {

//        length()
//        length() method that gives the number of characters in a String.

        String s1 = "college";
        String s2 = "programming language";

        int a = s1.length();
        System.out.println(a); //7
        System.out.println(s2.length()); //20

        String ss1 = "";
        String ss2 = null;

        System.out.println(ss1.length()); //0
        //System.out.println(ss2.length());  Exception


//        concat()
//        concat() is an inbuilt method for String concatenation in Java.


        String s3 = "How".concat(" are you?");
        System.out.println(s3);
        String s4 = "Baswaraj";
        String s5 = "Chavale";

        String s6 = s4 +s5 ;
        System.out.println(s6);

        String s7 = s4.concat(s5);
        System.out.println(s7);


//        toCharArray()
//        This method is used to convert all the characters of a string into a Character Array.

        char [] arr = s4.toCharArray();
        for (int i = 0; i < s4.length(); i++){
            System.out.println(arr[i]);
        }

        String s8 = "As4rt -adr3";
        char [] arr2 = s8.toCharArray();
        for (int i = 0; i < s8.length(); i++){
            System.out.println(arr2[i]);
        }

//        charAt()
//        This method is used to retrieve a single character from a given String.
//        System.out.println(s4.charAt(4));

        for (int i = 0; i <  s4.length(); i++){
            System.out.println(s4.charAt(i));
        }

//        compareTo()
//        This method is used to compare two Strings. The comparison is based on alphabetical order.
//        compareToIgnoreCase()

        System.out.println(s4.compareTo(s5));
        String s9 = "abcd";
        String s10 = "efgh";

        System.out.println(s10.compareTo(s9));
        System.out.println("abc".compareTo("abb"));

        String s91 = "ABCD";

        System.out.println(s91.compareTo(s9));
        System.out.println("cuurent " +s91.compareToIgnoreCase(s9));

//        contains()
//        This method is used to check whether a substring is a part of main string
//        Returntype is boolean

        String s11 = "Softwaretesting";
        String s12 = "SoftwareTesting";
        String s13 = "testing";

        System.out.println(s11.contains(s13)); //true
        System.out.println(s12.contains(s13)); //false
        System.out.println(s13.contains(s11)); //false
        System.out.println(s13.contains(s12)); //false



//        split()
//        As the name suggests, a split() method is used to split or separate the given String into multiple substrings
//        returntype of this method is array of string


        String s15 = "javaisaprogramminglanguage";
        String [] sarr2 = s15.split("a");

        System.out.println(sarr2[0]); //j
        System.out.println(sarr2[1]); //v
        System.out.println(sarr2[2]); //is

        for(int i = 0; i < sarr2.length ; i++){
            System.out.println(sarr2[i]);
        }

//        indexOf()
//        indexOf() is used to search for the first occurrence of the character or string
//        lastIndexOf() is used to search for the last occurrence of the character or string


        String s16 = "javaisaprogramminglanguage";

        System.out.println(s16.indexOf('i')); // 4
        System.out.println(s16.indexOf("java"));// 0
        System.out.println(s16.indexOf('p')); //7
        System.out.println(s16.indexOf("language")); //18

        System.out.println(s16.indexOf('a')); //1
        System.out.println(s16.lastIndexOf('a')); //23
        System.out.println(s16.lastIndexOf("an")); //19
        System.out.println(s16.indexOf("an")); //19



//        replace()
//        The replace() method is used to replace the character with the new characters
//        or string with new string in the original String.

        String s17 = s16.replace('a','e'); //jeveiseprogremminglenguege
        System.out.println(s17);
        String s18 = s16.replace("is","was"); //javawasaprogramminglanguage
        System.out.println(s18);


//        String valueOf()
//        String valueOf() method converts from int to String. It converts int to String,
//        long to String, boolean to String, character to String, float to String, double to String.


        Integer b = 10;
        float c = 45.57F;
        double d = 457.554;
//        long e = 45781.2542l ;
        boolean f = true;

        String b1 = String.valueOf(b);
        System.out.println(b);
        String f1 = String.valueOf(f);
        System.out.println(f);


    }
}
