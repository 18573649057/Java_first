package cn.itcast.StudentManager;

public class Student {
    private String id;
    private String name;
    private int age;
    private String brithday;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public Student(String id, String name, int age, String brithday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }

    public Student() {
    }
}
