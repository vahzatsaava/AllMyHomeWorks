package com.company.queue;

public class PropertiesReadingException extends RuntimeException{
    public PropertiesReadingException(Throwable cause){
        super("Проблема во время чтения настроек",cause);
    }
}
