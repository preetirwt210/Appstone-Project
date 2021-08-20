package com.student.fee.springboot.StudentFee.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.fee.springboot.StudentFee.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
