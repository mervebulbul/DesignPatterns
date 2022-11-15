package org.example;

import javax.xml.bind.JAXBException;
public interface GeneralSerializer {
    void prepareData(StudentInfo myStudentInfo) throws JAXBException;
}
