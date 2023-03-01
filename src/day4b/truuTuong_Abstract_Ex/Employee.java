package day4b.truuTuong_Abstract_Ex;

public abstract class Employee {
    private  String id;
    private  String name;
    private  String dob;

    public Employee() {
    }

    public Employee(String id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }


    // Phương thức trừu tượng -> KHÔNG chứa phần thân chi tiết
    public abstract String job();
}
