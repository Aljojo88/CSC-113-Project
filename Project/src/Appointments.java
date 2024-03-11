
public class abstract Appointments {
protected String date;
   protected int time;

   public Appointment(String date, int time){
      this.date = date;
      this.time = time;
   }
   
   /*public Appointment(Appointment b){
   this.day = b.day;
   this.time = b.time;
   }*/

   public abstract double CalculatePrice();

   public String toString(){
      return date + " at " + time;
   }

public String getDate(){

return date;

}

public int getTime(){

return time;

}






}
