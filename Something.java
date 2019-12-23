package lab3;

public class Something implements place  {
	protected String act;
	public void actions (String act){
		this.act= act;
		System.out.print(act + " ");
		
	}
	@Override
	public void around(String v) {
		System.out.print("вокруг"+ " "+ v + " ");
		
	}

	@Override
	public void in(String v) {
		System.out.print("в"+ " "+ v+ " ");
		
	}

	@Override
	public void on(String v) {
		System.out.print("на"+ v + " ");
		
	}

	@Override
	public void behind(String v) {
		System.out.print("за"+ " "+ v+ " ");
		
	}
	
	public void across(String v){
		System.out.print("через "+ v+ " ");
	}
	

}
