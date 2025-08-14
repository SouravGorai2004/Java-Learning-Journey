class Employee implements Cloneable{
	private String ename;
	private int age;

	Employee(String ename, int age){
		this.ename=ename;
		this.age=age;
	}
	public void setName(String ename){
		this.ename=ename;
	}
	public void display(){
		System.out.println("Name is : "+ename);
		System.out.println("Age is : "+age);
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}


}
class ShallowCopy{
	public static void main(String argv[]) throws Exception{
		Employee e1= new Employee("Sourav",21);
		Employee e2=(Employee)e1.clone();
		
		e1.display();
		e2.display();
		System.out.println("-----------AFTER MODIFICATION------------");
		e2.setName("Rahul");
		e1.display();
		e2.display();
	}
	
}