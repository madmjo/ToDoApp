package se.lu.lunduniversity.toDoApp;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    List<Task> tasks = new ArrayList<>();

    public ToDoList() {

    }

    public void add(Task task) {
        if(!tasks.contains(task)) {
            tasks.add(task);
        } else {
            System.out.println("This task already exists");
        }
    }

    public void edit(Task newTask) {
        int index = getIndexOfTaskWithId(newTask.getId());
        if(index != -1) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Task with id = " + newTask.getId() + " does not exist");
        }
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public void markAsDone(int id) {
        int index = getIndexOfTaskWithId(id);
        if(index != -1) {
            Task tmpTask = tasks.get(index);
            tmpTask.setDone(true);
        } else {
            System.out.println("Task with id = " + id + " does not exist");
        }
    }

    /**
     *
     * tasks.stream()
     *          .filter(task -> task.isDone() == done
     *          .count();
     */
    public long countTasksByStatus(boolean done) {
       long counter = 0;
       for(Task task: tasks) {
           if(task.isDone() == done) {
               counter++;
           }
       }
       return counter;
    }
    private int getIndexOfTaskWithId(int id) {
        for(int i=0; i< tasks.size(); i++) {
            if(tasks.get(i).getId() == id) {
                 return i;
            }
        }
        return -1;
    }
}
