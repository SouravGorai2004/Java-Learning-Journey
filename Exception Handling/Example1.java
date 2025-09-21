class Division{
	int x;
	int y;
	Division(int x, int y){
		System.out.println("Constructor of Division Class...");
		this.x=x;
		this.y=y;
}
	public void div() throws ArithmeticException {
		
	int c = x/y;
	System.out.println("Division is : "+c);

	}
}

class HelperClass{
	Division d;
	HelperClass(int x , int y){
		System.out.println("Constructor of HelperClass...");
		d= new Division(x,y);
	}
	void mayThrow() throws ArithmeticException {
	System.out.println("From mayThrow() method ...");
	d.div();
	}
	
}

class Test{
	public static void main(String s[]){

		try{
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			HelperClass obj = new HelperClass(a,b);
			obj.mayThrow();
		}

		catch(ArrayIndexOutOfBoundsException e ){
				System.out.println("Give at least 2 elements...");
			}
		catch(NumberFormatException e ){
				System.out.println("You must give  0-9 digit... ");
			}
		catch(ArithmeticException e ){
				System.out.println("Divisor Should not be zero...");
			}
		catch(Exception e ){
				System.out.println("Something went wrong ...");
			}



}
	}