import java.util.ArrayList;
import java.util.List;

import _01_AnimalFarm.Animal;



public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> a = new ArrayList<Animal>();
	cow c1 = new cow();
	a.add(c1);
	cow c2 = new cow();
	a.add(c2);
	cow c3 = new cow();
	a.add(c3);
	cow c4 = new cow();
	a.add(c4);
	cow c5 = new cow();
	a.add(c5);
	cow c6 = new cow();
	a.add(c6);
	
	for (int i = 0; i < a.size(); i++) {
		a.get(1).makeNoise();
	}
}
}
