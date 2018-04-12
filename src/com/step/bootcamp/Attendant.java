package com.step.bootcamp;

import java.util.ArrayList;

public class Attendant {
  private final ArrayList<ParkingLot> parkingLots;
  private String name;

  public Attendant(String name) {
    this.name = name;
    parkingLots = new ArrayList<>();
  }

  public void add(ParkingLot parkingLot) {
    parkingLots.add(parkingLot);
  }

  public Object park(Vehicle vehicle) throws CannotParkException {
    for (ParkingLot parkingLot : parkingLots) {
     if(!parkingLot.isFull()) return parkingLot.park(vehicle);
    }
    throw new CannotParkException("Parking is full");
  }

  public Vehicle checkoutFor(Object token) throws VehicleNotFoundException {
    for (ParkingLot parkingLot : parkingLots) {
      try {
        return parkingLot.checkoutFor(token);
      } catch (VehicleNotFoundException ignored){}
    }
    throw new VehicleNotFoundException();
  }


  public String generateReport() {
    String report = "Name: " + name + "\n";
    for (ParkingLot parkingLot : parkingLots) {
      report += parkingLot.generateReport() + "\n";
    }
    return report;
  }

  public String toHTML() {
    String report = "<html><body>";
    report += "<h3>" + name + "<h3><br>" + "<table><tr><th>Parking Id</th>" + "<th>Capacity</th></tr>";
    for (ParkingLot parkingLot : parkingLots) {
      report += parkingLot.toHTML();
    }
    return report + "</table></body></html>";
  }
}
