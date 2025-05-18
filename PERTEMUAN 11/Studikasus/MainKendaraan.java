package Studikasus;

public class MainKendaraan {

	    public static void main(String[] args) {
	        Mobil mobil = new Mobil("Toyota Avanza");
	        Motor motor = new Motor("Honda Vario");

	        mobil.nyalakanMesin();
	        mobil.bergerak();
	        mobil.matikanMesin();

	        System.out.println();

	        motor.nyalakanMesin();
	        motor.bergerak();
	        motor.matikanMesin();
	    }
	}


