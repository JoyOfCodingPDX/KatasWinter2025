package edu.pdx.cs.joy.pair4;

public class Args {
    String id;
    int startTime;
    int endTime;
    int duration;
    int money;

    Args(String id, int startTime, int duration, int money) {
        this.id = id;
        this.startTime = startTime;
        this.duration = duration;
        this.money = money;
        this.endTime = startTime + duration;
    }
}