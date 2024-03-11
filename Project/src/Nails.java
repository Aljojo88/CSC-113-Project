
public class Nails extends Appointment{
   private char type;

   public Nails(String day, int time, char type){
      super(day, time);
      this.type = type;
   }

   public double CalculatePrice(){
      if ((type=='c')||(type=='S'))
         return time*80.0;
      else if ((type=='a')||(type=='A'))
         return time*90.0;
      else if ((type=='c')||(type=='C'))
         return time*100.0;
      else
         return 0;
   }
   
 public char getType(){
 
 return type;
 
 
 }  
   
   
   
   
   
   
}
