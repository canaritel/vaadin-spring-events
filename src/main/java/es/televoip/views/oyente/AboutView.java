package es.televoip.views.oyente;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import es.televoip.data.entity.Course;
import es.televoip.views.MainLayout;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@Component
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);

        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("This place intentionally left empty"));
        add(new Paragraph("It’s a place where you can grow your own UI 🤗"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

    // Oyente de los eventos publicados
    @EventListener
    public void createCourse(Course course) throws InterruptedException {
        System.out.println("CONSUMER: A course has been created with title: " + course.getTitle());
        Notification.show("CONSUMER: A course has been created with title: " + course.getTitle());
    }

}
