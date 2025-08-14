class Address{
	private String vill;
	private String post;
	private int pin;
	Address(String vill, String post, int pin){
		this.vill=vill;
		this.post=post;
		this.pin=pin;
	}
	public String getVill(){
		return this.vill;
	}
	public String getPost(){
		return this.post;
	}
	public int getPin(){
		return this.pin;
	}
	public String toString(){
		return ("VILL: "+this.vill+", POST: "+this.post+", PIN: "+this.pin);
	}

	public void setVill(String vill){
		this.vill=vill;
	}
}
class Employee implements Cloneable{
	private String ename;
	private int age;
	public Address add;

	Employee(String ename, int age,Address add){
		this.ename=ename;
		this.age=age;
		this.add=add;
	}

	/*public void changeAddress(Address add){
		this.add=add;
	}*/

	public void setName(String ename){
		this.ename=ename;
	}
	public void display(){
		System.out.println("Name is : "+ename);
		System.out.println("Age is : "+age);
		System.out.println("Address is : "+add);
	}
	public Object clone() throws CloneNotSupportedException{
		Employee cobj=(Employee)super.clone();
		cobj.add=new Address(cobj.add.getVill(),cobj.add.getPost(),cobj.add.getPin());
		return cobj;
	}


}
class DeepCopy{
	public static void main(String argv[]){
		Address add1=new Address("Bhanora","Barabani",713334);
		Employee e1= new Employee("Sourav",21,add1);
		Employee e2=null; //Local Variable must be decleared
		try{
			e2=(Employee)e1.clone();
		}catch(CloneNotSupportedException e){
			System.out.println("Exception Name is "+e.getClass());
		}
		
		
		e1.display();
		e2.display();
		System.out.println("-----------AFTER MODIFICATION------------");
		e2.setName("Sujit");
		//e2.changeAddress(add2);
		e2.add.setVill("Asansol");
		e1.display();
		e2.display();
	}
	
}