package lab3;

public class House extends Something{
	private String name;
	protected static int room;
	public static boolean DoorIsOpen = false;
	protected House (String name){
		System.out.println(" существует ");
	}
	protected String getName() {
		return name;
		
	}
	protected void setName(String name) {
		this.name = name;
		 System.out.print(name + " ");
	}
	public void be(){
		System.out.print("быть обычным домом");
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	protected Door door= new Door("дверь", Adjective.бумажная);
	protected class Door {
       
       
		protected Door(String name, Adjective ad) {
           System.out.print("в котором есть "+ ad + " "+ name+ " ");
            }
        protected void leads(){
        	System.out.print("дверь должна куда-то вести ");

        }

		
		}
	public Stairs getStairs() {
		return stairs;
	}
	public void setStairs(Stairs stairs) {
		this.stairs = stairs;
	}
	protected Stairs stairs= new Stairs("и лестница");
	protected class Stairs {
       
        protected Stairs(String name) {
            System.out.print(name+ " " );
            }
        protected void leads(){
        	System.out.print("а лестница должна подниматься наверх ");

        }

		
		}
	public static class Plan{
		public static int getRoom(){
			return room;
		}
	}

}