public class Profesor extends Osoba {
    private String kolegij;

    public Profesor(String firstName, String lastName, int age, String sex, String kolegij) {
        super(firstName, lastName, age, sex);
        this.kolegij = kolegij;
    }

    @Override
    public void predstavljanje() {
        System.out.println("Ime je:" + this.firstName + "\t Prezime je:\t" + this.lastName + ",\tDob je :" + this.age + ",\tSpol je:" + this.sex + ",\tKolegij je:" + this.kolegij);
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam profesor :\t" + this.firstName + this.lastName);
    }
}
