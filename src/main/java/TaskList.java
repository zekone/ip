import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> list;

    public TaskList() {
        this.list = new ArrayList<>();
    }

    public Task getTask(int index) {
        return list.get(index);
    }

    public void addTask(Task task) {
        list.add(task);
    }

    public Task deleteTask(int index) {
        Task deleted = list.get(index);
        list.remove(index);
        return deleted;
    }

    public void markDone(int index) {
        list.get(index).setDone();
    }

    public void markNotDone(int index) {
        list.get(index).setNotDone();

    }

    public boolean hasIndex(int index) {
        return index > 0 && index < list.size();
    }

    public int size() {
        return list.size();
    }

}