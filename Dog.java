package question2_assignment2_3560;

import java.util.ArrayList;
import java.util.List;

public class Dog {
	private String breed;
	private String name;
	private List<Paw> paws = new ArrayList<Paw>(4);;
	
	public Dog()
	{
		paws = new ArrayList<Paw>();
		paws.add(new Paw(1));
		paws.add(new Paw(2));
		paws.add(new Paw(3));
		paws.add(new Paw(4));
		
	}
}
