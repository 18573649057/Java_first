package demo1.day01.demo2;

public class Student {
    String name;
    int age;
    static String classroom;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public static String getClassroom() {
        return classroom;
    }

    public static void setClassroom(String classroom) {
        demo1.day01.demo2.Student.classroom = classroom;
    }
}
