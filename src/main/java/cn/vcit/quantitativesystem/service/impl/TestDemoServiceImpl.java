package cn.vcit.quantitativesystem.service.impl;

import cn.vcit.quantitativesystem.bean.Student;
import cn.vcit.quantitativesystem.dao.StudentMapper;
import cn.vcit.quantitativesystem.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServiceImpl implements TestDemoService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void test() {
        System.out.println("这是TestDemoServiceImpl");
        List<Student> students = studentMapper.selectAll();
        System.out.println(students);


    }
}
