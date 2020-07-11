package ua.schedule;

import java.util.Date;

public class Lesson {

    private String name;
    private int roomNumber;
    private String professorsName;
    private Date start;
    private Date finish;

    public Lesson(String name, int roomNumber, String professorsName) {
        this.name = name;
        this.roomNumber = roomNumber;
//        this.professorsName = professorsName;
//        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getProfessorsName() {
        return professorsName;
    }

    public void setProfessorsName(String professorsName) {
        this.professorsName = professorsName;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }




}
