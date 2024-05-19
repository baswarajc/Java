package ProgrammingPractice;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        AnonymousTest p = new AnonymousTest();
        p.taste();

        AnonymousTest p1 = new AnonymousTest()
        {
           void taste(){
               System.out.println("Spicy");
           }
        };

        p1.taste();

        AnonymousTest p2 = new AnonymousTest()
        {
            void taste(){
                System.out.println("Sweet");
            }
        };

        p2.taste();

        p1.display();

    }
}
