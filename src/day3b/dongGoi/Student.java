package day3b.dongGoi;

public class Student {
    String id;
    String name;

    String address;

    public Student(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

public String getId(){
        return  id;
}
}