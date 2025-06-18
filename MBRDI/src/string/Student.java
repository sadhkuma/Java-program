package string;

public class Student {
	private String name;
	
	
	   Student(String name)
	   {
	   this.name = name;
	   }
	   
	  @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public String getName(){ 
	  return this.name;
	  }
	  public void setName(String name){
		  this.name = name;
	  }
	  
	  
}
