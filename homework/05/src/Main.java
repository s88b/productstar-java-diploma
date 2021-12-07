class Main {
    public static void main(String[] args) {

        SimpleStudent john = new SimpleStudent("Johnny", 21, 175, "enlish");
        PrintHuman(john);

        SimpleDocent paul = new SimpleDocent("Paul", 51, 185, "english");
        PrintHuman(paul);

        john.sayHi();
        john.haveAParty();

        paul.sayHi();
        paul.makeStudentsSuffer();
    }

    public static void PrintHuman(Human human) {
        System.out.println(human.name + " " +human.age + " " + human.height);
    }
}

