public class Fakultet {
    public static void main(String[] args) {
        Student s1 = new Student("Mate", "Matic", 19, "Musko", 2);
        Student s2 = new Student("Ana", "Matic", 22, "Zenski", 3);
        Profesor p1 = new Profesor("Veljko", "Mijić", 67, "Muški", "Osnove elektrotehnike");
        Profesor p2 = new Profesor("Matko", "Botrić", 65, "Muški", "Računalne mreže");
        //Student 1
        s1.dohvatiOpisUloge();
        s1.predstavljanje();
        //Student 2
        s2.dohvatiOpisUloge();
        s2.predstavljanje();

        //Profesor 1
        p1.dohvatiOpisUloge();
        p1.predstavljanje();
        //Profesor 2
        p2.dohvatiOpisUloge();
        p2.predstavljanje();

    }
}
