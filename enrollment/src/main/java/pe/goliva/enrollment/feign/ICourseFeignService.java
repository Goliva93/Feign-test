package pe.goliva.enrollment.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.goliva.enrollment.model.CourseDTO;

@FeignClient(name = "course-service")
public interface ICourseFeignService {

    @GetMapping("/api/courses/{course_id}")
    CourseDTO findCourse(@PathVariable int course_id);

}
