import com.ljs.demo.Eat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class TestMain {

    @Test
    public void test(){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");

        Eat danny = (Eat) appCtx.getBean("DannyEat_porxy");
        danny.eat("d");
//        System.out.println("--------------------");
//        Eat janny = (Eat) appCtx.getBean("JannyEat_porxy");
//        janny.eat("j");
        System.out.println("-------调用有返回值方法--------");
        String return_str = danny.eat_l("我是返回值");
        System.out.println(return_str);
    }
}
