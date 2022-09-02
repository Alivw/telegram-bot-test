package cn.jalivv.demo;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ParseMode;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;

public class Main {
    public static final String BOT_TOKEN = "5612291072:AAEdGsTWwxqpNQDHEj4YRPFokoeIa8KlUxc";

    public static void main(String[] args) {

        TelegramBot bot = new TelegramBot(BOT_TOKEN);

        SendMessage request = new SendMessage(5750747030L, "<b>bold</b>, <strong>bold</strong>\n" +
                "<i>italic</i>, <em>italic</em>\n" +
                "<u>underline</u>, <ins>underline</ins>\n" +
                "<s>strikethrough</s>, <strike>strikethrough</strike>, <del>strikethrough</del>\n" +
                "<span class=\"tg-spoiler\">spoiler</span>, <tg-spoiler>spoiler</tg-spoiler>\n" +
                "<b>bold <i>italic bold <s>italic bold strikethrough <span class=\"tg-spoiler\">italic bold strikethrough spoiler</span></s> <u>underline italic bold</u></i> bold</b>\n" +
                "<a href=\"http://www.example.com/\">inline URL</a>\n" +
                "<a href=\"tg://user?id=123456789\">inline mention of a user</a>\n" +
                "<code>inline fixed-width code</code>\n" +
                "<pre>pre-formatted fixed-width code block</pre>\n" +
                "<pre><code class=\"language-python\">pre-formatted fixed-width code block written in the Python programming language</code></pre>");
        request.parseMode(ParseMode.HTML);

        SendResponse response = bot.execute(request);
        System.out.println("re"+null);
        System.out.println("re"+null);
    }
}