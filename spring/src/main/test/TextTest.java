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
     * ���췽��ע��
     */
    @Test
    public void test1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }

    /**
     * set����ע��
     */
    @Test
    public void test2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditer te = (TextEditer) context.getBean("textEditer");
        te.spellCheck();
    }

    /**
     * �ڲ�ע��
     */
    @Test
    public void test3() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor2");
        te.spellCheck();
    }


    /**
     * �Զ�ע��byName
     */

    @Test
    public void byNameTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor1 textEditor1 = (TextEditor1) context.getBean("textEditor1");
        textEditor1.spellCheck();
    }

    /**
     * �Զ�ע��byType
     */

    @Test
    public void byTypeTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor1 textEditor1 = (TextEditor1) context.getBean("textEditor2");
        textEditor1.spellCheck();
    }

    /**
     * ���캯���Զ�װ��
     */
    @Test
    public void byConstTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        TextEditor2 textEditor2 = (TextEditor2) context.getBean("te2");
        textEditor2.spellCheck();
    }
}
