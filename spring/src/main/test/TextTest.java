import com.xc.bean.TextEditer;
import com.xc.bean.TextEditor;
import com.xc.bean.TextEditor1;
import com.xc.bean.TextEditor2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class TextTest {

    /**
     * 构造方法注入
     */
    @Test
    public void test1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

    /**
     * set方法注入
     */
    @Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditer te = (TextEditer) context.getBean("textEditer");
        te.spellCheck();
    }

    /**
     * 内部注入
     */
    @Test
    public void test3() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor2");
        te.spellCheck();
    }


    /**
     * 自动注入byName
     */

    @Test
    public void byNameTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor1 textEditor1 = (TextEditor1) context.getBean("textEditor1");
        textEditor1.spellCheck();
    }

    /**
     * 自动注入byType
     */

    @Test
    public void byTypeTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor1 textEditor1 = (TextEditor1) context.getBean("textEditor2");
        textEditor1.spellCheck();
    }

    /**
     * 构造函数自动装配
     */
    @Test
    public void byConstTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor2 textEditor2 = (TextEditor2) context.getBean("te2");
        textEditor2.spellCheck();
    }
}
