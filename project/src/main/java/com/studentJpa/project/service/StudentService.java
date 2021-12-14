package com.studentJpa.project.service;

import com.studentJpa.project.entity.CourseEntity;
import com.studentJpa.project.entity.StudentEntity;
import com.studentJpa.project.model.CourseModel;
import com.studentJpa.project.model.StudentModel;
import com.studentJpa.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentModel> getAllStudents() {
        List<StudentEntity> student  = studentRepository.findAll();
        return student.stream().map(e-> getStudents(e)).collect(Collectors.toList());
    }


    public StudentModel getById(Long id){
        Optional<StudentEntity> students = studentRepository.findById(id);
        if (students.isPresent()) {
            return getStudents(students.get());
        }
        return null;
    }

    public void addStudents(StudentModel studentModel){
        StudentEntity student = new StudentEntity();
      student.setId(studentModel.getId());
        student.setName(studentModel.getName());
        student.setEmail(studentModel.getEmail());
        student.setMobileNo(studentModel.getMobileNo());

        List<CourseEntity> course = new ArrayList<>();
       System.out.println(studentModel.getCourseModelList().get(0).toString());
        studentModel.getCourseModelList().forEach(std-> {
            CourseEntity courseDetails = new CourseEntity();
           courseDetails.setId(std.getId());
            courseDetails.setCourses(std.getCourses());
            courseDetails.setFee(std.getFee());
            courseDetails.setJoiningDate(std.getJoiningDate());
    //        courseDetails.setStudentEntity(student);
            course.add(courseDetails);
        });
        student.setCourseEntityList(course);


        studentRepository.save(student);
    }


    private StudentModel getStudents(StudentEntity studentEntity) {
            StudentModel studentModel = new StudentModel();
            studentModel.setId(studentEntity.getId());
            studentModel.setName(studentEntity.getName());
            studentModel.setEmail(studentEntity.getEmail());
            studentModel.setMobileNo(studentEntity.getMobileNo());

            List<CourseModel> courseModels = new ArrayList<>();
            studentEntity.getCourseEntityList().forEach(s-> {
                CourseModel courses = new CourseModel();
                courses.setId(s.getId());
                courses.setCourses(s.getCourses());
                courses.setFee(s.getFee());
                courses.setJoiningDate(s.getJoiningDate());
         //       courses.setStudentModel(studentModel);
                courseModels.add(courses);
            });
        studentModel.setCourseModelList(courseModels);


        return studentModel;
    }


}
