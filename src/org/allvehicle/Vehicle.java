package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
	public void vehicleNecessery() {
		
		System.out.println("Vehicle Necessary:");
		
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.vehicleNecessery();
		
		TwoWheller t = new TwoWheller();
		t.bike();
		t.cycle();
		
		ThreeWheeler th = new ThreeWheeler();
		th.auto();
		
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
	}

}
