public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary){
        super(name, address);
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public String toString() {
        return super.toString() + "\n  " + "salary " + getSalary() + " euro/month";
    }
}
