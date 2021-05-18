package com.example.fatascode.springbootreactfullstack.student;

import com.example.fatascode.springbootreactfullstack.student.exception.BadRequestException;
import com.example.fatascode.springbootreactfullstack.student.exception.StudentNotFoundException;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public void deleteStudent(Long studentId) {
        if (!studentRepository.existsById((studentId))) {
            throw new StudentNotFoundException("Student with id " + studentId + " does not exists");
        }
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student) {
        Boolean existsEmail = studentRepository.selectExistsEmail ( student.getEmail());

        if ( existsEmail) {
            throw new BadRequestException ("Email '"+ student.getEmail()+ "' is taken");
        }
        studentRepository.save(student);
    }
}
