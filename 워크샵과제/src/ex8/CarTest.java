package ex8;

public class CarTest {

	public static void main(String[] args) {

		Car[] array = new Car[2];

		array[0] = new L3("L3", "1500", 50, 25, 0);
		array[1] = new L5("L5", "2000", 70, 35, 0);

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
				System.out.println("---------------------------------------------------------------------------");
			}
			System.out.println(array[i].getName() + "\t\t" + array[i].getEngine() + "\t\t" + array[i].getOilTank() + "\t"
					+ array[i].getOilSize() + "\t" + array[i].getDistance() + "\t\t" + ((Temp) array[i]).getTempGage());
		}
		System.out.println();
		
		System.out.println("25 주유");
		for (int i = 0; i < array.length; i++) {
			array[i].setOil(25);
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
				System.out.println("---------------------------------------------------------------------------");
			}
			System.out.println(array[i].getName() + "\t\t" + array[i].getEngine() + "\t\t" + array[i].getOilTank() + "\t"
					+ array[i].getOilSize() + "\t" + array[i].getDistance() + "\t\t" + ((Temp) array[i]).getTempGage());
		}
		System.out.println();
		
		System.out.println("80 주행");
		for (int i = 0; i < array.length; i++) {
			array[i].go(80);
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
				System.out.println("---------------------------------------------------------------------------");
			}
			System.out.println(array[i].getName() + "\t\t" + array[i].getEngine() + "\t\t" + array[i].getOilTank() + "\t"
					+ array[i].getOilSize() + "\t" + array[i].getDistance() + "\t\t" + ((Temp) array[i]).getTempGage());
		}
		System.out.println();
	}

}
