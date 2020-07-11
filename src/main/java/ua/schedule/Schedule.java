package ua.schedule;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.text.SimpleDateFormat;
import java.util.*;

public class Schedule {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);        //get today day of week
        System.out.println(dayOfTheWeek);


    }
}