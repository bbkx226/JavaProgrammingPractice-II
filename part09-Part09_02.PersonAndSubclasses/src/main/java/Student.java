public class Student extends Person{
    private int credit;

    public Student(String name, String address){
        super(name, address);
        this.credit = 0;    
    }

    public void study(){
        credit += 1;
    }

    public int credits(){
        return this.credit;
    }

    public String toString(){
        return super.toString() + "\n  " + "Study credits " + credits();
    }
}
