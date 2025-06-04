package ToDolist_CLI;

public class Task {
     private int id;
    private String description;
    private boolean iscompleted;

    Task(int id, String description){
        this.id = id;
        this.description = description;
        this.iscompleted = false;
    }

    public int getid(){
        return id;
    }

    public String getdescription(){
        return description;
    }

    public boolean iscompleted(){
        return iscompleted;
    }

    public void incomplete(){
        iscompleted = false;
    }

    public void complete(){
        iscompleted = true;
    }

    @Override
    public String toString(){
        return "[" + id + "]" + description+" " + iscompleted;
    }

}
