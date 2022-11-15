/*
Student Number:B211202350
Name: Merve BÜLBÜL
Homework 1
 */

package org.example;

import javax.xml.bind.JAXBException;


public class  Main {

    public static void main(String[] args)   throws JAXBException {

        StudentInfo myStudentInfo = new StudentInfo("1","Merve","Bülbül");


        Serializer mySerializer = new Serializer();

        GeneralSerializer serialize1 = mySerializer.getType("json");
        serialize1.prepareData(myStudentInfo);
        GeneralSerializer serialize2 = mySerializer.getType("xml");
        serialize2.prepareData(myStudentInfo);



    }
}