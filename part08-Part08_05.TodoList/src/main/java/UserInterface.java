import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner){
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String decision = scanner.nextLine();

            if(decision.equals("stop")){
                break;
            } else if(decision.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if(decision.equals("list")){
                tasks.print();
            } else if(decision.equals("remove")){
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                tasks.remove(index);
            }
        }
    }
}
