import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> person;
    
    public Employees(){
        this.person = new ArrayList<>();
    }

    public void add(Person personToAdd){
        person.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.person.add(person));
    }

    public void print() {
        Iterator<Person> iterator = this.person.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.person.iterator();

        while (iterator.hasNext()) {
            Person check = iterator.next();
            if (education.equals(check.getEducation())) {
                System.out.println(check);
            }
        }

    }

    public void fire(Education education){
        Iterator<Person> iterator = this.person.iterator();

        while (iterator.hasNext()) {
            Person check = iterator.next();
            if (education.equals(check.getEducation())) {
                iterator.remove();
            }
        }
    }

}
