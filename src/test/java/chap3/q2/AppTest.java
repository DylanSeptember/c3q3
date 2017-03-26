package chap3.q2;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testClass()
    {
        App app = new App();

        assertNotNull(app);
    }

    public void testMorning()
    {
        Morning m = new Morning();

        assertNotNull(m);
    }

    public void testAfternoon()
    {
        Afternoon a = new Afternoon();

        assertNotNull(a);
    }

    public void testEvening()
    {
        Evening e = new Evening();

        assertNotNull(e);
    }
         private greet gr1;
         private greet gr2;
        private greet gr3;

        @BeforeMethod

        public void setUp() throws Exception {

            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

            gr1 = (greet) ctx.getBean("greet1");
            gr2 = (greet) ctx.getBean("greet2");
            gr3 = (greet) ctx.getBean("greet3");

        }

    @AfterMethod

    public void tearDown() throws Exception {

    }

    //@Test

    public void testSayHelloMorning() throws Exception {

        String result = gr1.sayHello();

        Assert.assertEquals("Good Morning Bruh!", result);

    }

    public void testSayHelloAfternoon() throws Exception {

        String result = gr2.sayHello();

        Assert.assertEquals("Good Afternoon Bruh!", result);

    }

    public void testSayHelloEvening() throws Exception {

        String result = gr3.sayHello();

        Assert.assertEquals("Good Evening Bruh!", result);

    }
    }

