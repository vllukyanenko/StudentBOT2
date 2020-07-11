import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ua.weather.bot.Model;
import ua.weather.bot.Weather;
import java.io.IOException;



public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi=new TelegramBotsApi();
        try{
            telegramBotsApi.registerBot(new Bot());
        }catch(TelegramApiException e){
            e.printStackTrace();
        }
    }

    public void sendMsg(Message message, String text){
        SendMessage sendMessage=new SendMessage();
        sendMessage.enableMarkdown(false);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try{
            new Keyboard().setButtons(sendMessage);
            execute(sendMessage);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public void onUpdateReceived(Update update) {
        Model model= new Model();
        Message message = update.getMessage();
        // We check if the update has a message and the message has text
        if(message!=null && message.hasText()){
            switch (message.getText()){
                case "/help":
                    sendMsg(message, "Чем я могу помочь?");
                            break;
                case"/setting":
                    sendMsg(message, "Что будем настраивать?");
                            break;
                default:
                    try{
                        sendMsg(message, Weather.getWeather(message.getText(), model));
                    }catch (IOException e){
                        sendMsg(message,"Город не найден!");
                    }
            }
        }

    }

    public String getBotUsername() {
        return "Student_UkrDUZT_bot";
    }

    public String getBotToken() {
        return "1393568128:AAHXivBOZyALzP4sLJJ9s5LlyAeHzVqC9ps";
    }
}
