package ua.schedule;

public class Lesson {

    private String name;
    private String roomNumber;
    private String professorsName;
    private String start;
    private String finish;

    public Lesson(String name, String roomNumber, String professorsName, String start, String finish) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.professorsName = professorsName;
        this.start = start;
        this.finish = finish;
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

    public CharSequence getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }





}
