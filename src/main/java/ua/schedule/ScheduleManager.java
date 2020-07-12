package ua.schedule;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScheduleManager {
    String result="";


    public String getTodaySchedule() {


        List<Lesson> scheduleDay;

        DaysDeterminant daysDeterminant= new DaysDeterminant();
        scheduleDay=daysDeterminant.getDayDeterminant();

            String[] res = new String[scheduleDay.size()];
            String joined;
            for (int i = 0; i < scheduleDay.size(); i++) {
                //combine our strings from list
                joined = String.join(" ", scheduleDay.get(i).getStart(), scheduleDay.get(i).getName(), scheduleDay.get(i).getRoomNumber(), scheduleDay.get(i).getProfessorsName(),"\n");
                res[i] = joined;
                result = result.concat(res[i]);
            }
            System.out.println(result);
            return result;


        }


    }