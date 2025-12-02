package studentdetailsmanagement;

public class Student {
    private int id, age, year;
    private String name, course;

    public Student(int id, String name, int age, String course, int year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.year = year;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public int getYear() { return year; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
    public void setYear(int year) { this.year = year; }
}
