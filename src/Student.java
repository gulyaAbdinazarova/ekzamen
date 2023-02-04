public class Student extends Person implements Live{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void live() {

    }

    @Override
    public void living() {

    }

    @Override
    public String toString() {
        return "Student" + getName()+ " " +getAge();
    }
}
