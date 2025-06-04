package ToDolist_CLI;

import java.util.Scanner;

public class todo {
    public static final Scanner sc = new Scanner(System.in);
    private static final TodoList todolist = new TodoList();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();

            try {
                choice = Integer.parseInt(sc.nextLine());
                handleChoice(choice);
            } catch(NumberFormatException e){
                System.out.println("Invalid input ... please enter a number ");
                choice = -1;
            }
        } while(choice != 5);
        
    }

    private static void showMenu(){
        System.out.println("To Do app");
        System.out.println("1. add task ");
        System.out.println("2. view Task");
        System.out.println("3.Delete Task ");
        System.out.println("4.Mark Task ");
        System.out.println("5. exit ");
        System.out.println("Enter Your Choice ");
    }

    private static void handleChoice(int choice){
        
        switch(choice){
            case 1 -> addTask();
            case 2 -> todolist.viewTask();
            case 3 -> deleteTask();
            case 4 -> markTask();
            case 5 -> System.out.println("Exiting ");
            default -> System.out.println("Invalid input ");
        }
    }

    private static void addTask(){
        System.out.println("Enter description ");
        String description  = sc.nextLine();
        todolist.addTask(description);
    }

    private static void deleteTask(){
         System.out.println("enter id to delete ");
         int id = Integer.parseInt(sc.nextLine());
         todolist.deleteTask(id);

    }

    private static void markTask(){
        System.out.println("Enter Task to check ");
        int id = Integer.parseInt(sc.nextLine());
        todolist.markTask(id);
    }
}
