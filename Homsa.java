package lab3;

public class Homsa extends Mumi {
	protected Homsa(){
		setSex("мужской");}
	protected void go(){
		System.out.print("пошел ");
	}
	protected void openDoor(){
		System.out.print("Открыл дверь");
		House.DoorIsOpen=true;
	}
	protected void see(String so){
		System.out.print("увидел "+ so+ " "); 
	}
	 protected void think(){
		 System.out.print("размышлял о том что ");
	 }
}
