public class TestAnimal {
	public static void main (String[] a) {

		//tak boleeh buat object sebab dia abstract (not possible)
		//InterfaceCelebrity ic = new InterfaceCelebrity(); //abstract

		// Animal a1 = new Animal();
		// a1.speak(); //tutup sebab dah jadi abstract class

		Haiwan h = new Haiwan();
		h.setName("New Species");
		System.out.println(h.getName());

		Cat c = new Cat();
		c.bunyi();
		c.speak();
		c.setName("Tom");
		System.out.println(c.getName());

		Mouse m = new Mouse();
		m.setName("Jerry");
		System.out.println(m.getName());
		m.speak();

		CartoonCat garfield = new CartoonCat();
		//garfield.bunyi(); //extend cat so boleh ambil car
		garfield.speak(); //extend animal @ cartooncat
		garfield.setName("Garfield");
		System.out.println(garfield.getName());
		garfield.screenTime("Garfield Home Alone");
		System.out.println("Pay is " + garfield.pay(10));

		garfield.screenTime2("Garfield Home Alone the sequel");
		System.out.println("Pay is " + garfield.pay2(20));
	}
}
