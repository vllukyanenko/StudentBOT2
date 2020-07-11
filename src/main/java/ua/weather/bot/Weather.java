package ua.weather.bot;

import org.json.JSONArray;
import org.json.JSONObject;
import ua.weather.bot.Model;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.util.Scanner;

public class Weather {
    //14631d73c87c0b7a90afe9c257db25ce

    public static String getWeather(String message, Model model) throws IOException{
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+message+"&units=metric&appid=c664e3831183695f33206941e04a663a");

        Scanner scanner= new Scanner((InputStream) url.getContent());
        String result="";
        while(scanner.hasNext()){
            result+=scanner.nextLine();
        }
        JSONObject object=new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main=object.getJSONObject("main");

        model.setTemp(main.getDouble("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray=object.getJSONArray("weather");
        for (Object i:getArray) {
            JSONObject obj= (JSONObject) i;
            model.setIcon((String) obj.get("icon"));
            model.setMain((String) obj.get("main"));

        }



        return "Город: "+model.getName()+"\n"+
                "Температура: "+model.getTemp()+"\n"+
                "Влажность: "+model.getHumidity();

    }

}
