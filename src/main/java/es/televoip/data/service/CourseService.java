package es.televoip.data.service;

import es.televoip.data.entity.Course;
import java.util.List;

public interface CourseService {

    public interface ProductService {

        List<Course> findAllCourses();

        Course findCourseById(Long id);

        Course createCourse(Course course);

        Course updateProduct(Course course);

        void deleteCourseById(Long id);
    }

}
