package com.step.bootcamp;

import org.junit.Ignore;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class AttendantsTest {

    @Test
    public void shouldPrintReport() throws FileNotFoundException, UnsupportedEncodingException {
        Attendants attendants = new Attendants();
        ParkingLot parkingLot5 = new ParkingLot(1, 5);
        ParkingLot parkingLot6 = new ParkingLot(2, 6);
        Attendant attendant = new Attendant("patel");
        attendant.add(parkingLot5);
        attendant.add(parkingLot6);
        attendants.add(attendant);
        attendants.add(new Attendant("Pallabi"));
        ArrayList<String > output = new ArrayList<>();
        PrintWriter writer = new PrintWriter("report.txt", "utf8");
// {
//            @Override
//            public void write(String report) {
//                output.add(report);
//            }
//        };
        attendants.generateReport(writer);
        writer.close();
//        assertThat(output).contains("");
    }

    @Test
    @Ignore
    public void shouldgenerateReportInHtml() throws FileNotFoundException, UnsupportedEncodingException {
        Attendants attendants = new Attendants();
        ParkingLot parkingLot5 = new ParkingLot(1, 5);
        ParkingLot parkingLot6 = new ParkingLot(2, 6);
        Attendant attendant = new Attendant("patel");
        attendant.add(parkingLot5);
        attendant.add(parkingLot6);
        attendants.add(attendant);
        Attendant pallabi = new Attendant("Pallabi");
        pallabi.add(new ParkingLot(4,20));
        attendants.add(pallabi);
        ArrayList<String > output = new ArrayList<>();
        PrintWriter writer = new PrintWriter("final.html", "utf8");
//        {
//            @Override
//            public void write(String report) {
//                output.add(report);
//            }
//        };
        attendants.generateReport(writer);
        writer.close();
//        assertThat(output).contains("");
    }
}
