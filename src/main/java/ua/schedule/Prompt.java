package ua.schedule;

import java.util.List;

public class Prompt {
   synchronized public String getPrompt() {
       List<Lesson> lessonNow;
       String less;
       int i = 0;
       lessonNow = new DaysDeterminant().getDayDeterminant();
       switch (new TimeAndDate().getTime()) {
           case "14:07":
               less = String.join(" ", "Занятия начинаются через 5 мин.", lessonNow.get(i).getStart(), lessonNow.get(i).getName(), lessonNow.get(i).getRoomNumber(), lessonNow.get(i).getProfessorsName());
               if (!less.isEmpty()) {
                   return less;
               }
           case "14:08":
               i = 1;
               less = String.join(" ", "Следующая пара:", lessonNow.get(i).getStart(), lessonNow.get(i).getName(), lessonNow.get(i).getRoomNumber(), lessonNow.get(i).getProfessorsName());
               if (!less.isEmpty()) {
                   return less;
               }
           case "14:09":
               i = 2;
               less = String.join(" ", "Следующая пара:", lessonNow.get(i).getStart(), lessonNow.get(i).getName(), lessonNow.get(i).getRoomNumber(), lessonNow.get(i).getProfessorsName());
               if (!less.isEmpty()) {
                   return less;
               }

           case "14:10":
               i = 3;
               less = String.join(" ", "Следующая пара:", lessonNow.get(i).getStart(), lessonNow.get(i).getName(), lessonNow.get(i).getRoomNumber(), lessonNow.get(i).getProfessorsName());

               if (!less.isEmpty()) {
                   return less;
               }
           default: return "";


       }

   }
}
