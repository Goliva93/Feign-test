package pe.goliva.enrollment.service;

import pe.goliva.enrollment.model.Enrollment;

import java.util.List;

public interface IEnrollmentService {

    Enrollment createEnrollment(Enrollment enrollment);

    List<Enrollment> findAll();

    Enrollment findById(int enrollment_id);

}
