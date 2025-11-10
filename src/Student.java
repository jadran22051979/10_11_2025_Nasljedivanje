public class Student extends Osoba {
    private int godinaStudija;

    public Student(String firstName, String lastName, int age, String sex, int godinaStudija) {
        super(firstName, lastName, age, sex);
        this.godinaStudija = godinaStudija;
    }

    @Override
    public void predstavljanje() {
        System.out.println("Ime je:\t" + this.firstName + "\t Prezime je:\t" + this.lastName + ",\tDob je :" + this.age + ",\tSpol je:" + this.sex + ",\tGodina studija je:" + this.godinaStudija);
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam student :\t" + this.firstName + "\t" + this.lastName);
    }
}
