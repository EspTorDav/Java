package ToDoList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TaskList taskList = new TaskList();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.println("Menu:");
            System.out.println("1. New task");
            System.out.println("2. Modify task");
            System.out.println("3. Remove task");
            System.out.println("4. Mark task as complete");
            System.out.println("5. Show task");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Task description:");
                    String description = scanner.nextLine();
                    taskList.newTask(description);
                    break;
                case 2:
                    System.out.println("Enter the task index:");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new description:");
                    String newDescription = scanner.nextLine();
                    taskList.modifyTask(taskIndex, newDescription);
                    break;
                case 3:
                    System.out.println("Enter index of the task to remove:");
                    int taskIndexToRemove = scanner.nextInt();
                    taskList.removeTask(taskIndexToRemove);
                    break;
                case 4:
                    System.out.println("Enter index to mark task as completed:");
                    int taskIndexCompleted = scanner.nextInt();
                    taskList.taskIsCompleted(taskIndexCompleted);
                    break;
                case 5:
                	taskList.showTask();
                    break;
                case 6:
                    System.out.println("¡See ya later!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("No valid option");
                    break;
            }
		}
	}

}
