package org.example;

public class Piano extends Instrument {
    public Piano(String type){
        super(type);
    }

    @Override
    public String play() {
        return "piano spielt";
    }

    @Override
    public String toString() {
        return "Piano{} " + super.toString();
    }
}
