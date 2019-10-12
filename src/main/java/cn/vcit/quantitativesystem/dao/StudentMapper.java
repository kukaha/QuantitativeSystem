package cn.vcit.quantitativesystem.dao;

import cn.vcit.quantitativesystem.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(String studentId);

    int insert(Student record);

    Student selectByPrimaryKey(String studentId);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}