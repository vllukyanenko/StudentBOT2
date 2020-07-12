package ua.schedule;

import java.util.List;

public class DaysDeterminant {
    public List<Lesson> getDayDeterminant(){
        // get list of lesson for day of week

        List<Lesson> scheduleDay;
        Schedule schedule = new Schedule();
        schedule.setSchedule();
        switch (new TimeAndDate().getWeekDay()) {
            case "понедельник":
                scheduleDay =schedule.getMonday();
                break;
            case "вторник":
                scheduleDay = schedule.getTuesday();
                break;
            case "среда":
                scheduleDay = schedule.getWednesday();
                break;
            case "четверг":
                scheduleDay = schedule.getThursday();
                break;
            case "пятница":
                scheduleDay = schedule.getFriday();
                break;
            default: return null;
        }
        return scheduleDay;
    }
}
