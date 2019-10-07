package se.lu.lunduniversity.toDoApp;

import java.sql.Date;

public class Task {
    private static int COUNTER = 0;

    private String title;
    private Date dueDate;
    private boolean done;
    private int id;

    public Task() {
        done = false;
        id = COUNTER;
        COUNTER++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (done != task.done) return false;
        if (title != null ? !title.equals(task.title) : task.title != null) return false;
        return dueDate != null ? dueDate.equals(task.dueDate) : task.dueDate == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (dueDate != null ? dueDate.hashCode() : 0);
        result = 31 * result + (done ? 1 : 0);
        return result;
    }
}
