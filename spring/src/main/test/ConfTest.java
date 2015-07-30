import com.xc.bean.Hello;
import com.xc.bean.TextEditor;
import com.xc.conf.HelloConf;
import com.xc.conf.TextEditorConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class ConfTest {

    @Test
         public void test1(){

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConf.class) ;
        Hello hello =  context.getBean(Hello.class);

        hello.setMessage("Hello World!");
        hello.getMessage();

    }

    @Test
    public void test2(){

        ApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class) ;
        TextEditor textEditor= context.getBean(TextEditor.class);
        textEditor.spellCheck();

    }
}
