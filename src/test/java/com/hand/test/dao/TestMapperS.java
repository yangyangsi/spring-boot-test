package com.hand.test.dao;

import com.hand.test.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.annotation.Target;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperS {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    public void test(){
        List<Student> studentList = studentMapper.getAllStudent();

        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
    }

}
