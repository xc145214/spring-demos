import com.xc.bean.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class EventTest {
    @Test
    public void eventTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellobeans.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.getMessage();
    }



}
