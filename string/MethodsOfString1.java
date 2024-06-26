package string;

public class MethodsOfString1 {
    public static void main(String[] args) {
//        String s = " Is What is your is name? What is ";
//
//        System.out.println(s.replace("is","was"));

        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));


        String s1 = "gjgjVDHVhwvjJHBShbbsh";

//        toLowerCase()
//        Converts characters in the string to lower case

        System.out.println(s1.toLowerCase());  //gjgjvdhvhwvjjhbshbbsh

//        toUpperCase()
//        Converts characters in the string to upper case

        System.out.println(s1.toUpperCase()); //GJGJVDHVHWVJJHBSHBBSH


        String s2 = "  Java is  programming  Language    ";
        System.out.println(s2);
        System.out.println(s2.trim());


//        matches()
//        matches() method check whether the string matches the given regular expression

        String r = "^ja...l$";   // should be fallow pattern -  ja___l

        String s3 = "javetl";
        System.out.println(s3.matches(r)); // true

        String s4 = "jrgfwl";
        System.out.println(s4.matches(r));  // false

        String r1 = "^r....fh$"; // should be fallow pattern - r____fh

        System.out.println("rertyfh".matches(r1));

//        startsWith()
//        startsWith() method check whether the string starts with specified string
        String s5 = "Warje";
        System.out.println(s5.startsWith("Wa")); //true
        System.out.println(s5.startsWith("wa")); //false

//        endsWith()
//        endsWith() method check whether the string ends with specified string

        System.out.println(s5.endsWith("je"));  // true
        System.out.println(s5.endsWith("j"));   // false

//        isEmpty()
//        isEmpty() method check given string empty or not , returns true if length is zero

        System.out.println(s5.isEmpty()); //false

        String s6 = "";
        System.out.println(s6.isEmpty());  //true



        char []  arr = {'b','a','s','w','a','r','a','j'};
        String s7  = "";
        s7 = s7.copyValueOf(arr,0,8);
        System.out.println(s7);


//        trim()
//        trim() method in Java returns a new string which is the copy of the original string
//        with leading and trailing spaces removed from it.

        String str = " This is an example    ";
        String newStr = str.trim();
        System.out.println(newStr);  //"This is an example

//        contentEquals()
//        checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer

        String s = "abcd efgh ijkl";
        String ss = "abcd efgh ijkl";
        String sss = "abcd efgh ijklm";

        System.out.println(s.contentEquals(ss));
        System.out.println(s.contentEquals(sss));

//        equals()
//        Compares two strings. Returns true if the strings are equal, and false if not

        System.out.println(s.equals(ss));

//        equalsIgnoreCase()
//        Compares two strings, ignoring case considerations

        String ss1 = "ABcd Efgh ijKL";
        System.out.println(s.equalsIgnoreCase(ss1));
    }

}
