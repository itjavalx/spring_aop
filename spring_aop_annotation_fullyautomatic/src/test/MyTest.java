import com.ljs.demo.DannyEat;
import com.ljs.demo.Eat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_aop.xml"})
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop.xml");
        Eat dannyEat = ac.getBean(Eat.class);
        dannyEat.eat("午餐");
    }
}
