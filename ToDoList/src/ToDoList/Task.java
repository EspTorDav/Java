package ToDoList;

public class Task {
	
	String description;
	boolean completed;
	
	public Task(String description) {
		
		this.description = description;
		this.completed = false;
	}
	
	public void completed() {
		
		this.completed = true;
	}
	
	@Override
	public String toString() {
		return "[" + (completed ? "X" : " ") + "] " + description;
	}
	
	

}
