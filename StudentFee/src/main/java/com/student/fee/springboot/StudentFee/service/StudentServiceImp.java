package com.student.fee.springboot.StudentFee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.fee.springboot.StudentFee.StudentDao.StudentRepository;
import com.student.fee.springboot.StudentFee.entity.Student;

@Service
public class StudentServiceImp implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImp(StudentRepository thestudentRepository) {
		studentRepository=thestudentRepository;
	}
	@Override
	@Transactional
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Student> result=studentRepository.findById(theId);
		Student theStudent = null;
		
				if(result.isPresent()){
					theStudent=result.get();
				}else {
					throw new RuntimeException("Did not find student id: " + theId);
				}
				return theStudent;
	}

	@Override
	@Transactional
	public void save(Student theStudent) {
		studentRepository.save(theStudent);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);

	}

}
