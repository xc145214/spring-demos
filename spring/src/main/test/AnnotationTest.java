import com.xc.bean.Profile;
import com.xc.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class AnnotationTest {

    @Test
    public void test1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotationBean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());

    }


    @Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("annotationBean.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();

    }
}
