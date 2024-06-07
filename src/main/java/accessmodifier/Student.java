package accessmodifier;

public class Student {

    public String name;
    protected int age;
    private double psp;
    String email; // default X

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", email='" + email + '\'' +
                '}';
    }
}
