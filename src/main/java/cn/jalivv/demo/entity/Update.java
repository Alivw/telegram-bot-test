package cn.jalivv.demo.entity;

import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.ChosenInlineResult;
import com.pengrad.telegrambot.model.InlineQuery;
import com.pengrad.telegrambot.model.Message;

class Update {
    Integer updateId;
    Message message;
    Message editedMessage;
    InlineQuery inlineQuery;
    ChosenInlineResult chosenInlineResult;
    CallbackQuery callbackQuery;
}