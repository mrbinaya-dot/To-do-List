import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    ArrayList<Lists> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void Start(){
        while (true) {
            System.out.println("\n=== To do list ===");
            System.out.println("1. Add task");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by no");
            System.out.println("4. Delete Task");
            System.out.println("5. Mark Task");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addTask();
                    break;

                case 2:
                    viewTask();
                    break;
                case 3:
                    searchTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    markSlist();
                    break;

                case 6:
                    System.out.println("Good bye");
                    return;



                      default:
                    System.out.println("Invalid choice ");
                    return;

            }








        }



    }
public void addTask(){
    System.out.println("please enter the task");
    String task= scanner.nextLine();
    scanner.nextLine();
    Lists lt = new Lists(task);
    list.add(lt);

    System.out.println("added");

}
public void viewTask(){
        if(list.isEmpty()){
            System.out.println("no Task to show ");

        }


            System.out.println("To-Do List:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
        }

}
private void searchTask() {
    System.out.println("Enter the Keyword to search:");
    String task = scanner.nextLine().trim().toLowerCase();

    for (int i = 0; i < list.size(); i++) {

        String att = String.valueOf(list.get(i));
        if (att.toLowerCase().contains(task)){
            System.out.println((i+1)+"."+att);


        }
    }
}

private void deleteTask() {
        viewTask();

        if (list.isEmpty()) {
            return;
        }

        System.out.print("Enter task number to delete: ");
        int num = scanner.nextInt();

        if (num > 0 && num < list.size()) {
            Lists removed = list.remove(num - 1);
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Invalid task number.");
        }
    }
    private void markSlist() {
        viewTask();

        if (list.isEmpty()) {
            System.out.println("empty task");
        } else {


            System.out.println("Mark the task ");
            int num = scanner.nextInt();
            if (num > 0 && num < list.size()) {
                list.get(num - 1).Ismark();
                System.out.println("mark done ");

            }else {
                System.out.println("invalid");
            }
        }
    }

    }








