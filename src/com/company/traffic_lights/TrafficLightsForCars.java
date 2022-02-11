package com.company.traffic_lights;

public class TrafficLightsForCars {

    public void start(){
        while (true) {
            try {
                shineRed();
                shineYellow();
                shineGreen();
                shineYellow();
                shineRed();
                shineGreenArrowAndRed();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    private void shineGreen() throws InterruptedException {
        System.out.println(LightsStatus.GREEN);
        Thread.sleep(4500);
    }

    private void shineRed() throws InterruptedException {
        System.out.println(LightsStatus.RED);
        Thread.sleep(3800);
    }

    private void shineYellow() throws InterruptedException {
        System.out.println(LightsStatus.YELLOW);
        Thread.sleep(2000);
    }
    private void shineGreenArrowAndRed() throws InterruptedException {
        String res = String.format("%s  %s =>",LightsStatus.RED,LightsStatus.ARROW);
        System.out.println(res);
        Thread.sleep(1000);
    }

}
