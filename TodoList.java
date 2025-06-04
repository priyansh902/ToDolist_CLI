package ToDolist_CLI;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
     private List<Task> list = new ArrayList<>();
    private int nextid = 1;
    public void addTask(String description){
        Task task = new Task(nextid++, description);
        list.add(task);
        System.out.println("Task addes " + list);
    }
    public void viewTask(){
        if(list.isEmpty()){
            System.out.println("list is empty ");
            return;
        } else {
        
            System.out.println(list);
        }
    }

    public void deleteTask(int id){
        Task removed = list.remove(id);
        if(removed != null){
            System.out.println("Task removed " + removed.getdescription() );
        } else {
            System.out.println("Book not found ");
        }
    }

    public void markTask(int id){
        Task task = list.get(id);
        if(task == null){
            System.out.println("Task not found");
        } else if(!task.iscompleted()){
            System.out.println("Task is not completed");
        } else {
            System.out.println("task is completed");
        }
    }
}
