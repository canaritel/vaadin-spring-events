package es.televoip.observable;

import es.televoip.data.entity.Course;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CoursePublisher {

    @Autowired
    private ApplicationEventPublisher publisher;

//    public CoursePublisher(ApplicationEventPublisher publisher) {
//        this.publisher = publisher;
//    }
    public void publish() throws InterruptedException {
        System.out.println("PUBLISHER: Producing course");
        Thread.sleep(1000);
        publisher.publishEvent(new Course(generateRandomString()));
    }

    private String generateRandomString() {
        return RandomStringUtils.randomNumeric(5);
    }
}
