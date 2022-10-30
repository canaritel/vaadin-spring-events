package es.televoip.data.controller;

import es.televoip.data.entity.Course;
import es.televoip.data.repository.CourseRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/courses")
@RequiredArgsConstructor
public class CourseResource {

    @Autowired
    private CourseRepository handler;

    @GetMapping("/course")
    public List<Course> courses() {
        return (List<Course>) handler.findAll();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable int id) {
        return handler.findById((long) id).orElse(null);
    }

    @PostMapping("/course")
    public void postCourse(@RequestBody Course course) {
        handler.save(course);
    }
}
