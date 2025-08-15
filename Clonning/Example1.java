/* Explanation : Since the Employee class doesn’t implement the Cloneable marker interface,
calling clone() from Object throws a CloneNotSupportedException, which is then caught by the catch block. */

class Employee{
     int x;
     String str;
     Employee(int x,String b){
          this.x=x;
          this.str=b;
      }
      public String toString(){
          return "ID: "+x+" Name: "+str;
      }
      public Object clone() throws CloneNotSupportedException{
          return super.clone();
      }
}
class Example1{
      public static void main(String[] args){
           try{
                Employee obj=new Employee(1,"Sun");
                System.out.println(obj);
                Employee obj2=new Employee(2,"Moon");
                System.out.println(obj2);
                Employee obj3=(Employee)obj.clone();
                obj3.x=3;
                System.out.println(obj);
           }
           catch(CloneNotSupportedException e){
                 System.out.println("No permission to clone");
           }
       }
}