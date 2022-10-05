package org.example;

// Kindobject
public class Guitar extends Instrument {
    private Integer numberOfStrings = 0;

    public Guitar() {
    }

    public Guitar(String type) {
        super(type);
    }

    @Override
    public String play() {
        return "gitare spielt";
    }


    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }



    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                "} " + super.toString();
    }

}
