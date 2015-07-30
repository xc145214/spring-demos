import com.xc.bean.Hello;
import com.xc.bean.HelloIndia;
import com.xc.bean.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2015/7/30.
 */
public class HelloTest {

    @Test
    public void hello() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");
        Hello obj = (Hello) context.getBean("hello");
        obj.getMessage();
    }


    @Test
    public void xmlTest() {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("hellobeans.xml"));
        Hello hello = (Hello) factory.getBean("hello");
        hello.getMessage();
    }

    @Test
    public void fileTest() {

        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\practise\\spring-showcase\\spring\\src\\main\\resources\\hellobeans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.getMessage();
    }


    @Test
    public void singleTonTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        Hello helloA = (Hello) context.getBean("hello1");
        helloA.setMessage("I am bean A!");
        helloA.getMessage();

        Hello helloB = (Hello) context.getBean("hello1");
        helloB.getMessage();
    }


    @Test
    public void prototypeTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        Hello helloA = (Hello) context.getBean("hello2");
        helloA.setMessage("I am bean A!");
        helloA.getMessage();

        Hello helloB = (Hello) context.getBean("hello2");
        helloB.getMessage();
    }


    @Test
    public void lifeTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        Hello hello = (Hello) context.getBean("hello3");
        hello.getMessage();

    }

    @Test
    public void registerTest() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("hellobeans.xml");
        Hello hello = (Hello) context.getBean("hello3");
        hello.getMessage();
        context.registerShutdownHook();
    }

    @Test
    public void templateTest1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }


    @Test
    public void templateTest2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        HelloIndia objB = (HelloIndia) context.getBean("indiaBean");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }



}
