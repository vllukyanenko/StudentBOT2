package ua.schedule;
import java.text.SimpleDateFormat;
import java.util.*;

public class ScheduleManager {
    String result="";


    public String getTodaySchedule() {
        //get today day of week
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date date = new Date();
        String dayOfTheWeek = sdf.format(date);
        System.out.println(dayOfTheWeek);

        Schedule schedule = new Schedule();
        schedule.SetSchedule();
        List<Lesson> scheduleDay;
// get list of lesson for day of week
        switch (dayOfTheWeek) {
            case "понедельник":
                scheduleDay = schedule.getMonday();
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
            default: return "У Вас сегодня выходной. Выдыхайте!";
        }

            String[] res = new String[schedule.getMonday().size()];
            String joined;
            for (int i = 0; i < scheduleDay.size(); i++) {
                //combine our strings from list
                joined = String.join(" ", scheduleDay.get(i).getName(), scheduleDay.get(i).getRoomNumber(), scheduleDay.get(i).getProfessorsName());
                res[i] = joined;
                result = result.concat(res[i]);
            }
            System.out.println(result);
            return result;


        }


    }