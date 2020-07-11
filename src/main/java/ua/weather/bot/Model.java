package ua.weather.bot;

public class Model {

    private String name;
    private double temp;
    private double humidity;
    private String icon;
    private String main;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMain(Object main) {
        return this.main;
    }

    public void setMain(String main) {
        this.main = main;
    }




}
