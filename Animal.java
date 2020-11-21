public abstract class Animal { //tambah keyword abstract
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void speak();//paksa semua jadi speak //{
	// 	System.out.println("Animal sound");
	// }
}