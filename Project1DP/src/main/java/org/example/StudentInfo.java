package org.example;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement()
@XmlType(propOrder = {"studentId","name","surname"})

public class StudentInfo {
    private  String studentId;
    private  String name;
    private  String surname;


    public StudentInfo(String studentId, String name, String surname) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
