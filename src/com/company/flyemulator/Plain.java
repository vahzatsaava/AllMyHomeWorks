package com.company.flyemulator;

public class Plain extends Thread {
    //процесс это в целом приложение
    //в рамках одного процесса будут потоки
    Boolean aBoolean;

    Plain(Boolean bool) {
        this.aBoolean = bool;
    }

    //когда есть один ресурс которые хотят получить нескольок пототоков
    @Override
    public void run() {
        synchronized (aBoolean) {
            System.out.println("Самолет садится !" + " " + getId());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Самолет взлетел !" + " " + getId());
        }
    }
}
