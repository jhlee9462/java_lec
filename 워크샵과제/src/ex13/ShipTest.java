package ex13;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {

		ArrayList<Ship> list = new ArrayList<>();
		
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01", 1000));
		
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------------------");
		for (Ship ship : list) {
			System.out.println(ship.getShipName() + "\t\t" + ship.getFuelTank());
		}
		System.out.println();
		
		System.out.println("10 운항");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------------------");
		for (Ship ship : list) {
			ship.sail(10);
		}
		for (Ship ship : list) {
			System.out.println(ship.getShipName() + "\t\t" + ship.getFuelTank());
		}
		System.out.println();
		
		System.out.println("50 주유");
		System.out.println("shipName\tfuelTank");
		System.out.println("-------------------------------------");
		for (Ship ship : list) {
			ship.refuel(50);
		}
		for (Ship ship : list) {
			System.out.println(ship.getShipName() + "\t\t" + ship.getFuelTank());
		}
		System.out.println();
	}

}
