package ua.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDate {

    String timeNow;
    public String getTime(){
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    timeNow=dateFormat.format(date);
    return timeNow;
    }

    public String getWeekDay(){
    TimeAndDate todayDate = new TimeAndDate();
        todayDate.getTime();
    //get today day of week
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
    Date date = new Date();
    String dayOfTheWeek = sdf.format(date);

        return dayOfTheWeek;
    }
}
