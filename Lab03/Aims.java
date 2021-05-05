
public class Aims {
		public static void main(String[] argv) {
			//DigitalVideoDisc d1 = new DigitalVideoDisc();
			//System.out.println(d1.getTitle());
			//DigitalVideoDisc d2 = new 
			//		DigitalVideoDisc("Bo gia");
			//System.out.println(d2.getTitle());
			
			Order anOrder = new Order();
			
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
			dvd1.setCategory("Animation");
			dvd1.setCost(19.95f);
			dvd1.setLength(87);
			dvd1.setDirector("Roger Allers");
			
			anOrder.addDigtalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
			dvd1.setCategory("Science Fiction");
			dvd1.setCost(24.95f);
			dvd1.setLength(90);
			dvd1.setDirector("George Lucas");
			
			anOrder.addDigtalVideoDisc(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
			dvd1.setCategory("Animation");
			dvd1.setCost(18.99f);
			dvd1.setLength(90);
			dvd1.setDirector("John Musker");
			
			anOrder.addDigtalVideoDisc(dvd3);
			
			System.out.print("Total Cost is: ");
			System.out.println(anOrder.totalCost());

		}
}
