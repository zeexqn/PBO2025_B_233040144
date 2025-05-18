package Studikasus;


	public class Motor extends Kendaraan implements Mesin {

	    public Motor(String nama) {
	        super(nama);
	    }

	    @Override
	    public void bergerak() {
	        System.out.println(nama + " melaju di jalur motor.");
	    }

	    @Override
	    public void nyalakanMesin() {
	        System.out.println("Mesin " + nama + " dinyalakan.");
	    }

	    @Override
	    public void matikanMesin() {
	        System.out.println("Mesin " + nama + " dimatikan.");
	    }
	}


