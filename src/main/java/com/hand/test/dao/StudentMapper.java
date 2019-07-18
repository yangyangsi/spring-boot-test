package com.hand.test.dao;

import com.hand.test.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> getAllStudent();
    void InsertStudent(Student student);
}
