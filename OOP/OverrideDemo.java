interface A{
	default void method1(){
		System.out.println("Method1() is called");
	}


}
class OverrideDemo implements A{
	@Override
	void method1(){                                                //It's has default access
		System.out.println("Overriden Method1() is called");
	}
	
	public static void main(String a[]){
	
		OverrideDemo obj = new OverrideDemo();
		obj.method1();	
		
	}

}