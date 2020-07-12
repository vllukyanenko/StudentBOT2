package ua.schedule;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

// create lists for days of week;
        List<Lesson> monday = new ArrayList<>();
        List<Lesson> tuesday = new ArrayList<>();
        List<Lesson> wednesday = new ArrayList<>();
        List<Lesson> thursday = new ArrayList<>();
        List<Lesson> friday = new ArrayList<>();

    public List<Lesson> getMonday() {
        return monday;
    }

    public List<Lesson> getTuesday() {
        return tuesday;
    }


    public List<Lesson> getWednesday() {
        return wednesday;
    }



    public List<Lesson> getThursday() {
        return thursday;
    }



    public List<Lesson> getFriday() {
        return friday;
    }



    public void setSchedule() {

        monday.add(new Lesson(" Психология ", " 1.223 ", " Колесников К.Э;", "08:00", "09:20" ));
        monday.add(new Lesson(" ТАУ ", " 1.225 ", " Хисматулин В.Ш; ", "09:30", "10:50"));
        monday.add(new Lesson(" Теория надежности систем автоматики ", " 221 ", " Кустов В.Ф; ", "11:00", "12:20"));

        thursday.add(new Lesson(" Социология ", " 2.223 ", " Колесников К.Э; " , "08:00", "09:20"));
        thursday.add(new Lesson(" ТАУ ", " 3.225 ", " Хисматулин В.Ш; ", "09:30", "10:50"));
        thursday.add(new Lesson(" ОПВ ", " 1.221 ", " Лапко А.О; ", "11:00", "12:20"));

        tuesday.add(new Lesson(" Алгоритмизация ", " 2.123 ", " Головко А.В; ", "08:00", "09:20"));
        tuesday.add(new Lesson(" Телекомуникации ", " 1.219 ", " Лисечко В.П; ", "09:30", "10:50"));
        tuesday.add(new Lesson(" Теория надежности систем автоматики ", " 221 ", " Кустов В.Ф; ", "11:00", "12:20"));

        wednesday.add(new Lesson(" Психология ", " 223 ", " Колесников К.Э ; ", "08:00", "09:20"));
        wednesday.add(new Lesson(" ТАУ ", " 225 ", " Хисматулин В.Ш ; ", "09:30", "10:50"));
        wednesday.add(new Lesson(" Теория надежности систем автоматики ", " 221 ", " Кустов В.Ф; ", "11:00", "12:20"));

        friday.add(new Lesson(" Психология ", " 223 ", " Колесников К.Э ; ", "08:00", "09:20"));
        friday.add(new Lesson(" ТАУ ", " 225 ", " Хисматулин В.Ш ; ", "09:30", "10:50"));
        friday.add(new Lesson(" Теория надежности систем автоматики ", " 221 ", " Кустов В.Ф; ", "11:00", "12:20"));
    }

}

