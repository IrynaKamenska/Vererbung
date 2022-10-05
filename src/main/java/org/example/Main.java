package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar("Guitarre");
        System.out.println(guitar.play());

        Piano piano = new Piano("Klavier");
        System.out.println(piano.play());
        System.out.println(guitar.toString());


        Guitar eGuitar = new EGuitar();
        eGuitar.play();


        Drill drill = new Drill();
        System.out.println(drill.play());

        RecordStudio recordStudio = new RecordStudio();
        recordStudio.record(eGuitar);
        recordStudio.record(piano);

        recordStudio.record(drill);
        //    public void record(Audible instrument) {

        // List - ist interface
        // interface - object
        List<Instrument> liste = new ArrayList<>();
        List<Instrument> liste1 = new LinkedList<>();


        liste.add(piano);
        liste.add(eGuitar);


    }
}