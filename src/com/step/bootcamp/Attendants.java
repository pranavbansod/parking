package com.step.bootcamp;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Attendants {
    private final ArrayList<Attendant> attendants;

    public Attendants() {
        attendants = new ArrayList<>();
    }

    public void add(Attendant attendant) {
        attendants.add(attendant);
    }
    public void generateReport(PrintWriter writer) {
        for (Attendant attendant : attendants) {
            writer.write(attendant.toHTML()+"\n");
        }
    }
//    public void generateHtmlReport(PrintWriter writer) {
//        for (Attendant attendant : attendants) {
//            writer.write(attendant.generateReport()+ "<br>");
//        }
//    }
}
