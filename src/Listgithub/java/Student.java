package Listgithub.java;

public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 学号
     */
    private int studentNum;
    /**
     * 性别
     */
    private String sex;
    /**
     * 年级
     */
    private String grade;
    /**
     * 专业
     */
    private String specialty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentNum=" + studentNum +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
