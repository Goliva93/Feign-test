package pe.goliva.enrollment.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.goliva.enrollment.model.StudentDTO;

import java.util.List;

@FeignClient(name = "student-service")
public interface IStudentFeignService {

    @GetMapping("/api/student/list")
    List<StudentDTO> findStudentsByIds(@RequestParam("ids")List<Integer> ids);

}
