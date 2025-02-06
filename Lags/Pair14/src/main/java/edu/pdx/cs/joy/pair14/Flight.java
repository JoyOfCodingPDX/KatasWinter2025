package edu.pdx.cs.joy.pair14;

public class Flight {
    private String name;
    private int startTime;
    private int endTime;
    private int price;

    Flight(String name, int startTime, int endTime, int price) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
    }

    private String getName(){
        return this.name;
    }
    private int getStartTime(){
        return this.startTime;
    }
    private int getEndTime(){
        return this.endTime;
    }
    private int getPrice(){
        return this.price;
    }

}
