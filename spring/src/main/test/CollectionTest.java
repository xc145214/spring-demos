import com.xc.bean.JavaCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2015/7/30.
 */
public class CollectionTest {
    @Test
    public void collectionTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        JavaCollection collection = (JavaCollection) context.getBean("javaCollection");

        collection.getAddressList();
        collection.getAddressMap();
        collection.getAddressSet();
        collection.getAddressProp();
    }
}
