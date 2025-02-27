package edu.pdx.cs.joy.mob4;

public class Numbers implements Comparable<Numbers>{

    public String top;
    public String middle;
    public String bottom;

    public Numbers(String top, String middle, String bottom){
        this.top = top;
        this.middle = middle;
        this.bottom = bottom;
    }

    @Override
    public int compareTo(Numbers o) {
        if(top.equals(o.top) && middle.equals(o.middle) && bottom.equals(o.bottom) ) {
            return 0;
        }else{
            return -1;
        }
    }
}
