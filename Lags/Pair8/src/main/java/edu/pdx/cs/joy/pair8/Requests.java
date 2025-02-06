package edu.pdx.cs.joy.pair8;

import java.util.List;

public class Requests {

    // attributes
    String plane;
    Integer startTime;
    Integer endTime;
    Integer price;
    Integer duration;

    public Requests(String plane, Integer startTime, Integer duration, Integer price) {
        this.plane = plane;
        this.startTime = startTime;
        this.endTime = this.startTime + duration;
        this.price = price;
        this.duration = duration;
    }


}
