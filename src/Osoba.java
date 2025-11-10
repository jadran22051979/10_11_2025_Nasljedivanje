public abstract class Osoba {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String sex;

    public abstract void dohvatiOpisUloge();

    public Osoba(String firstName, String lastName, int age, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void predstavljanje() {
        System.out.println("Ime je:" + this.firstName + "\t Prezime je:\t" + this.lastName + ",\tDob je :" + this.age + ",\tSpol je:" + this.sex);
    }


}
