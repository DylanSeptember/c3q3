package chap3.q2;

/**
 * Hello world!
 *
 */
interface greet{
    void sayHello();
}
public class App implements greet
{
    public static void main( String[] args )
    {
        App app = new App();

        app.sayHello();
    }

    public void sayHello()
    {
        System.out.println("Hello bro...");
    }
}
