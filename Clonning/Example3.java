class Example implements Cloneable{
     int x;
     Example(int a){
         this.x=a;
     }
     public String toString(){
         return ""+x;
     }



    /* public Object clone() throws Exception{              ********    When you override a method,
          return super.clone();                                 you can only declare the same 
    }                                                           exception or its subclass, not a broader one. ******  */
                                                                                         



     public Object clone() throws CloneNotSupportedException{
         return super.clone();
     }
}
class Example3{
     public static void main(String[] args) throws Exception{
         Example obj=new Example(0);
         Example obj2=(Example)obj.clone();
         obj2.x=1;
         System.out.println(obj);
         System.out.println(obj2);
     }
} 
    

