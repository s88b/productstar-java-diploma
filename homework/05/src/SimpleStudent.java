public class SimpleStudent extends Human {

    public SimpleStudent(String name, int age, int height, String department) {
        super(name, age, height, department);
    }

    public void sayHi() {
        System.out.println("Good morning, sir! My name is " + name + " and I'm a student");
    }

    public void haveAParty() {
        System.out.println("Party time! BYOB!");
    }

}