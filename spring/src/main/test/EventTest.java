import com.xc.bean.Hello;
import com.xc.event.CustomEventPublisher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class EventTest {
    @Test
    public void eventTest1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("eventBeans.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.getMessage();
    }

    @Test
    public void eventTest2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("eventBeans.xml");

        CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
        cep.publish();
        cep.publish();
    }




}
