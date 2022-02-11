package com.company.threads;

public class MyThread extends Thread{
    public MyThread(String name){
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(getName());
            try {
                if (getName().equals("1")){
                    sleep(1000);
                }
                else{
                    sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
