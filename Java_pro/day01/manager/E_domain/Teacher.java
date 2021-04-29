package cn.itcast.manager.E_domain;

public class Teacher {
    private String id;  // 如果id加上静态，会所有学生，都是同一个id，不合理！！！
    private String name;
    private int age;
    private String birthday;

    // 什么情况下，可以使用static修饰方法？
    // 当这个静态方法中，没有使用到任何成员变量的时候。
    // 静态只能使用静态成员
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Teacher(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Teacher() {
    }
}
