package lab3;

public abstract class Mumi implements place {
	protected String name;
	protected String sex;
		public String getName() throws NoNameException{
			if ((name!= "")&&(name!=null)){
				return name;}
				else {
				       throw new NoNameException("Не указано имя"); }}
			
		
	public void setName(String name) {
	       this.name = name;
	       System.out.print(name + " ");
	   }
	public String getSex(){
		return sex;
	}
	public void setSex(String sex) {
	       this.sex = sex;
	       
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
