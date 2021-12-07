public class Human {
    public String name;
    public int age;
    public int height;
    public String department;

    public Human(String name, int age, int height, String department) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.department = department;
    }

    public void sayHi() {
        System.out.println("qwe");
    }

    public void describePerson() {
        System.out.println(
                name + " is " + age + " old and is " + height + " tall. " +
                        "Works in " + department + " department"
        );
    }
}