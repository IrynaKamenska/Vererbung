package org.example;

public class RecordStudio {

    // typ Audible wird verwendet
    public void record(Audible instrument) {
        System.out.println("Wir nehmen musik auf");
        System.out.println("Aufnahmen von: " + instrument.play());
    }
}
