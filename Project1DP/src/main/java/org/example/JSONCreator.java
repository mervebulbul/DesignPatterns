package org.example;
import com.google.gson.Gson;

public class JSONCreator implements GeneralSerializer {
    @Override
    public void prepareData(StudentInfo myStudentInfo){
        Gson gson = new Gson();
        String json = gson.toJson(myStudentInfo);
        System.out.println(json);
        System.out.println("\n");
    }
}
