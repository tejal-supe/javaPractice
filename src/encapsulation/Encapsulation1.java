package encapsulation;

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationIntro encap = new EncapsulationIntro();
//		encap.doTheThing()
		Laptop dell = new Laptop();
		dell.setPrice(21);
		System.out.println(dell.getPrice());
	}
	

}
class Laptop {
	int ram;
	private int price;
	
	public void setPrice(int price) { //setter
		//check if the user is admin
		boolean isAdmin = true;
		if(isAdmin) {
			this.price = price;			
		}
		else {
			System.out.println("Restricted!!!!!");
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
	
	
}
