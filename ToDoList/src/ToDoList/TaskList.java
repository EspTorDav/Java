package ToDoList;
import java.util.ArrayList;


public class TaskList {
	
	    ArrayList<Task> taskList;

	    public TaskList() {
	        this.taskList = new ArrayList<>();
	    }

	    public void newTask(String description) {
	        Task newTask = new Task(description);
	        taskList.add(newTask);
	    }

	    public void modifyTask(int index, String newDescription) {
	        if (index >= 0 && index < taskList.size()) {
	            taskList.get(index).description = newDescription;
	        } else {
	            System.out.println("Invalid index");
	        }
	    }

	    public void removeTask(int index) {
	        if (index >= 0 && index < taskList.size()) {
	        	taskList.remove(index);
	        } else {
	            System.out.println("Invalid index");
	        }
	    }

	    public void taskIsCompleted(int index) {
	        if (index >= 0 && index < taskList.size()) {
	        	taskList.get(index).completed();
	        } else {
	            System.out.println("Invalid index");
	        }
	    }

	    public void showTask() {
	        for (int i = 0; i < taskList.size(); i++) {
	            System.out.println(i + ": " + taskList.get(i));
	        }
	    }

}
