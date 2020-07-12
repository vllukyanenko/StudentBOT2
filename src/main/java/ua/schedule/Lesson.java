package ua.schedule;

import java.util.Date;

public class Lesson {

    private String name;
    private String roomNumber;
    private String professorsName;
    private Date start;
    private Date finish;

    public Lesson(String name, String roomNumber, String professorsName) {
        this.name = name;
        this.roomNumber = roomNumber;
       this.professorsName = professorsName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
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
