package Listgithub.java;

import java.util.Date;

import java.util.ArrayList;
import java.util.List;

public class School {

    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        Teacher teacher1 = new Teacher();
        teacher1.setName("张三");
        teacher1.setAge(23);
        teacher1.setSex("男");
        teacher1.setId("610441299908061242");
        teacher1.setPhoneNum(1234567890);

        Teacher teacher2 = new Teacher();
        teacher2.setName("李四");
        teacher2.setAge(45);
        teacher2.setSex("男");
        teacher2.setId("637263200127385671");
        teacher2.setPhoneNum(1234567890);

        teacherList.add(teacher1);
        teacherList.add(teacher2);
        System.out.println(teacherList);

        Student student1 = new Student();
        student1.setName("小明");
        student1.setGrade("大三");
        student1.setSex("男");
        student1.setSpecialty("计算机");
        student1.setStudentNum(1516064233);

        Student student2 = new Student();
        student2.setName("小红");
        student2.setGrade("大二");
        student2.setSex("女");
        student2.setSpecialty("美术");
        student2.setStudentNum(1234312);

        studentList.add(student1);
        studentList.add(student2);
        System.out.println(studentList);
        System.out.println(student1);
        System.out.println(teacher2);

    }
}
