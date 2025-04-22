package listInterface;
import javax.swing.*;
import java.util.ArrayList;
public class ToDoListJOptionPane {
    private ArrayList<String> list = new ArrayList<>();

    public void addTask() {
        list.add(JOptionPane.showInputDialog(null, "Please enter a task to add "));
    }

    public void removeTask() {
        JOptionPane.showInputDialog(null, "Please enter a task to remove ");
        list.remove(JOptionPane.showInputDialog(null, "Please enter a task to remove "));
    }

    public void viewTask() {
        StringBuilder taskList = new StringBuilder("Your Tasks:\n");
        for (String task : list) {
            taskList.append("- ").append(task).append("\n");
        }
        JOptionPane.showMessageDialog(null, taskList.toString());
    }

    public void exit() {
        JOptionPane.showMessageDialog(null, "Goodbye!");
        System.exit(0);
    }

    public void runner() {
        while (true) {
            String[] options = {"Add Task", "Remove Task", "View Tasks", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "To-Do List", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (choice) {
                case 0:
                    addTask();
                    break;
                case 1:
                    removeTask();
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    exit();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice!");
                    break;

        }
        }
    }
}

