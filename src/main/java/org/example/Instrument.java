package org.example;

// Elternobject

// abstracte klasse - keine objekte können erstellt werden
public abstract class Instrument implements Audible{
    private String type;

    public Instrument() { }
    public Instrument(String type) {
        this.type = type;
    }


    public abstract String play();


}
