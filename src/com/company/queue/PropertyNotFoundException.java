package com.company.queue;

public class PropertyNotFoundException extends NullPointerException{
    public PropertyNotFoundException(String s){
        super("Не найден ключ в файле настроек " + s);
    }
}
