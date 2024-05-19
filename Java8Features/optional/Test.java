package Java8Features.optional;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        String ss= null;
        Optional<String> s = Optional.ofNullable(ss);


//        System.out.println(s.get());
        System.out.println(ss);

        System.out.println(s.isEmpty());
    }
}
