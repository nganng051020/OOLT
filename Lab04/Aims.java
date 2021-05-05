
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order anOrder = new Order();
		// create a new DVD object and set the fields
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(90);
		// add the dvd to the order
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(20.0f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(87);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(20.3f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(92);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: " + anOrder.totalCost());
		
		DigitalVideoDisc abc[] = new DigitalVideoDisc[2];
		abc[0] = new DigitalVideoDisc();
		abc[1] = new DigitalVideoDisc();
		anOrder.addDigtalVideoDisc(abc);
		//System.out.println(abc[1].getTitle());
		anOrder.printOrder(abc);
		
	}

}
