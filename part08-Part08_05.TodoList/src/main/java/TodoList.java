import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    public void add(String task){
        tasks.add(task);
    }

    public void print(){
        int count = 1;
        for (String task: tasks){
            System.out.println(count + ": " + task);
            count++;
        }
    }

    public void remove(int number){
        tasks.remove(number-1);
    }
}
