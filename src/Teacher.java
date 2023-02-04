    public class Teacher extends Person implements Live{
    public Teacher(String name, int age) {
        super(name, age);
    }

        public void live() {

    }

    @Override
    public void living() {

    }

    @Override
    public String toString() {
        return "Teacher" +getName()+ " " + getAge();
    }
}



