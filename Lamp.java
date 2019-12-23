package lab3;

public class Lamp extends Interior {
	protected Lamp (Adjective a, Adjective a1, String name ){
		System.out.print(a+" "+ a1 +" "+name + " ");
	}
	public void with(){
		System.out.print("с ");
		class Tassels{
			protected Tassels(String name, Adjective ad){
				System.out.print(ad +" "+name + " ");
			}
		}
		Tassels tas = new Tassels("кисточками", Adjective.красными);
		tas.toString();  
	}
	

}
