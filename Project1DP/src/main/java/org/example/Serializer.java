package org.example;

public class Serializer {
    public static GeneralSerializer getType(String type){
        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("json")){
            return new JSONCreator();
        }
        else if(type.equalsIgnoreCase("xml")){
            return new XMLCreator();
        }
        return null;
    }
}
