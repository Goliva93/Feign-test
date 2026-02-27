package pe.goliva.enrollment.service.impl;

import org.springframework.stereotype.Service;
import pe.goliva.enrollment.model.Enrollment;
import pe.goliva.enrollment.service.IEnrollmentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EnrollmentServiceImpl implements IEnrollmentService {

    private List<Enrollment> enrollments;

    public EnrollmentServiceImpl(){

        this.enrollments = new ArrayList<>();
        Enrollment enr1 = new Enrollment(1,new ArrayList<>(Arrays.asList(1,2,3,4,5)),1);
        Enrollment enr2 = new Enrollment(2,new ArrayList<>(Arrays.asList(2,3)),2);
        Enrollment enr3 = new Enrollment(3,new ArrayList<>(Arrays.asList(4,5)),3);
        Enrollment enr4 = new Enrollment(4,new ArrayList<>(Arrays.asList(1,3,4)),4);
        this.enrollments.addAll(Arrays.asList(enr1,enr2,enr3,enr4));

    }


    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        this.enrollments.add(enrollment);
        return enrollment;
    }

    @Override
    public List<Enrollment> findAll() {
        return this.enrollments;
    }

    @Override
    public Enrollment findById(int enrollment_id) {
        return this.enrollments.stream().filter(u -> u.getEnrollment_id() == enrollment_id).findFirst().orElse(null);
    }
}

