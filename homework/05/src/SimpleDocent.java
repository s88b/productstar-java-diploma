public class SimpleDocent extends Human {

    public SimpleDocent(String name, int age, int height, String department) {
        super(name, age, height, department);
    }

    public void sayHi() {
        System.out.println("Yo, mate! I'm a docent. Respect my authority!");
    }

    public void makeStudentsSuffer() {
        System.out.println("You shall not pass!");
    }


}