package lab3;

public class Interior implements ThingsActions, place {
	

	@Override
	public void LineUp() {
		System.out.print("выстроились ");
		
	}

	@Override
	public void Stay() {
		System.out.print("стоял"+ " ");
	}

	@Override
	public void Seem (String s) {
	System.out.print("казался"+ " " + s + " ");
	}
	

	@Override
	public void Hang() {
		System.out.print("должен был висеть"+ " ");
	}

	@Override
	public void around(String v) {
		System.out.print("вокруг"+ " "+ v+ " ");
		
	}

	@Override
	public void in(String v) {
		System.out.print("в"+ " "+ v+ " ");
		
	}

	@Override
	public void on(String v) {
		System.out.print("на"+ " "+ v+ " ");
		
	}

	@Override
	public void behind(String v) {
		System.out.print("за"+ " "+ v+ " ");
		
	}
	

}

