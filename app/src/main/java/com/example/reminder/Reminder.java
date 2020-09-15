package com.example.reminder;

public class Reminder {
    private String title, infor;
    private boolean done;

    public Reminder(String title, String infor) {
        this.title = title;
        this.infor = infor;
        this.done = false;
    }

    public Reminder(String title, String infor, boolean done) {
        this.title = title;
        this.infor = infor;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
