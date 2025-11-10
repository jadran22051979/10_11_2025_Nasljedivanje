public class Fakultet {
    public static void main(String[] args) {
        Student s1 = new Student("Mate", "Matic", 19, "Musko", 2);
        Student s2 = new Student("Ana", "Matic", 22, "Zenski", 3);
        Profesor p1 = new Profesor("Veljko", "Mijić", 67, "Muški", "Osnove elektrotehnike");
        Profesor p2 = new Profesor("Matko", "Botrić", 65, "Muški", "Računalne mreže");

        s1.predstavljanje();
        s1.dohvatiOpisUloge();
        s2.predstavljanje();
        s2.dohvatiOpisUloge();

        p1.dohvatiOpisUloge();
        p1.predstavljanje();
        p2.dohvatiOpisUloge();
        p2.predstavljanje();

    }
}
