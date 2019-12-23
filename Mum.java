package lab3;

public class Mum extends Mumi  {
	protected Mum(){
		setSex("женский");
setName("Муми-мама");
	}

	protected void set() {
		System.out.print(" накрыла стол ");
		table.IsCover = true;
		
	}
	protected void dream(String about){
		System.out.println(" принялась мечтать о " + about);
	}
	protected void feel(String F){
		System.out.print(" почувствовала себя " + F);
		
	}
	protected void sit() throws NowhereToSitException{
		if (room.RockingChair== true){
			System.out.print ("села в кресло-качалку ");}
			else {
			       throw new NowhereToSitException("Некуда садиться ");
			       
			
		}
	}
	protected void count(String v) {
		System.out.print("пересчитала "+ v+ " ");
		
	}
	 
	}
	
	
	

	
	
	
	


