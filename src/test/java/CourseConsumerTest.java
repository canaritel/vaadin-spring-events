
import es.televoip.Application;
import es.televoip.observable.CoursePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootConfiguration
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class CourseConsumerTest {

//    @Autowired
//    private CourseConsumer courseConsumer;
    @Autowired
    private CoursePublisher courseProducer;

    @Test
    public void testConsumerProducer() throws InterruptedException {
        courseProducer.publish();
        courseProducer.publish();
        courseProducer.publish();
        Thread.sleep(3000);
    }
}
