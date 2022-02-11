package com.company.traffic_lights;

public class TrafficLightsForCars {
    public TrafficLightsForCars(){
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

    private LightsStatus shineGreen() throws InterruptedException {
        System.out.println(LightsStatus.GREEN);
        Thread.sleep(4500);
        return LightsStatus.GREEN;
    }

    private LightsStatus shineRed() throws InterruptedException {
        System.out.println(LightsStatus.RED);
        Thread.sleep(3800);
        return LightsStatus.RED;
    }

    private LightsStatus shineYellow() throws InterruptedException {
        System.out.println(LightsStatus.YELLOW);
        Thread.sleep(2000);
        return LightsStatus.YELLOW;
    }
    private LightsStatus shineGreenArrowAndRed() throws InterruptedException {
        String res = String.format("%s  %s =>",LightsStatus.RED,LightsStatus.ARROW);
        System.out.println(res);
        Thread.sleep(1000);
        return LightsStatus.ARROW;
    }

}
