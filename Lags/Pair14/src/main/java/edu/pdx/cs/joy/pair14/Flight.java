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

    public String getName(){
        return this.name;
    }
    public int getStartTime(){
        return this.startTime;
    }
    public int getEndTime(){
        return this.endTime;
    }
    public int getPrice(){
        return this.price;
    }

}
