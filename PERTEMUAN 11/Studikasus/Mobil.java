package Studikasus;


	public class Mobil extends Kendaraan implements Mesin {

	    public Mobil(String nama) {
	        super(nama);
	    }

	    @Override
	    public void bergerak() {
	        System.out.println(nama + " bergerak di jalan raya.");
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


