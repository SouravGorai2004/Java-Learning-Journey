class Example implements Cloneable{
     int x;
     int y;
     Example(int a,int b){
         this.x=a;
         this.y=b;
     }
     public String toString(){
          return ""+x+y;
     }
     public Object clone() throws CloneNotSupportedException{
          return super.clone();
     }
}
class Example2{
      public static void main(String[] args) throws Exception{
           Example obj=new Example(0,1);
           Example obj2=(Example)obj.clone();
           obj2.x=2;
           System.out.println(obj);
           System.out.println(obj2);
      }
}