import com.xc.aop.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/31.
 */
public class AopTest {

    @Test
    public void xmlAopTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopBean1.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
    @Test
    public void annoAopTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopBean2.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
