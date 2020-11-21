public class CartoonCat extends Animal implements InterfaceCelebrity, InterfaceCelebrity2 { //multiple inheritance
	
	public void speak() {
		System.out.println("Saya cakap bahasa manusia ");
	}

	public void screenTime(String episode) {
		System.out.println(episode);
	}

	public double pay(int hour) {
		return hour * 1.5;
	}
	//kalau nak guna interface semua yang ada kat interface kena copy semua

	//interfacecelebrity2 punya
	public void screenTime2(String episode){
		System.out.println("Eps " + episode);
	}
	public double pay2(int hour) {
		return hour * 1.5 * 2;
	}
}