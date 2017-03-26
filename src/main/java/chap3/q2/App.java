package chap3.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
interface greet{
    String sayHello();
}

public class App //implements greet
{

    public static void main( String[] args )
    {
      /*  App app = new App();
       app.sayHello();*/

        Morning morn = new Morning();

        Afternoon after = new Afternoon();
        Evening even = new Evening();

    }


}

class Morning implements greet
{

    Morning()
    {
        System.out.println(sayHello());
    }

    public String sayHello()
    {
        return "Good Morning Bruh!";
    }
}

class Afternoon implements greet
{
    Afternoon()
    {
        sayHello();
    }

    public String sayHello()
    {
        return "Good Afternoon Bruh!";
    }
}

class Evening implements greet
{
    Evening()
    {
        sayHello();
    }

    public String sayHello()
    {
        return "Good Evening Bruh!" ;
    }
}

