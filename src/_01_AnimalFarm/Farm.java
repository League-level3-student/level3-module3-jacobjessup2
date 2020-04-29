package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm{
	public static void main(String[] args) {
		ArrayList<Animal> array = new ArrayList<Animal>();
		array.add(new Chicken());
		array.add(new Chicken());
		array.add(new Pig());
		array.add(new Cow());
		array.add(new Sheep());
		array.add(new Sheep());
		for (int i = 0; i < array.size(); i++) {
			array.get(i).makeNoise();
		}
	}
}
