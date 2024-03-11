
public class Spa {
	
	private String name;
	private String branch;
	private int noOfC;
	private Customer customers [];
	
	public Spa(String name , String branch , int size) {
		this.name=name;
		this.branch=branch;
		customers = new Customer[size];
	}
	
	/*public Spa( Spa S ) {
		this.name=S.name;
		this.branch=S.branch;
		this.noOfC=S.noOfC;
      
		Customer arr [] = new Customer[S.customer.length];
		
		for(int i=0 ; i<noOfC ; i++)
			arr[i]=customer[i]; //revise
					
	}*/
      
	public int CalculatePoint() {
		int point = 0;
		
	  for(int i=0 ; i < noOfC ; i++)
		  if(customers[i].getTotalPrice() > 1000)
			  point = 30;
		  else
			  if(customers[i].getTotalPrice()<1000 && customers[i].getTotalPrice()>800)
				  point = 20;
			  else
				  if(customers[i].getTotalPrice()<800 && customers[i].getTotalPrice()>500)
					  point = 10;
	  
				  else
					  if(customers[i].getTotalPrice()<500 && customers[i].getTotalPrice()>200)
						  point = 5;
					  else
						  point = 0;
	  
	  return point;
	}
	
	public boolean addCustomer(Customer C) {
		if(noOfC < customers.length) {
			customers[noOfC++]=C;
		return true;
		}
		else
			return false;
	}
	
	/*public boolean removeCustomer(int C) {
		for(int i=0 ; i<noOfC ; i++)
			if(customers[i].getIndex()== 'C') {
				customers[C] = customers [customers.length-1];
		
		customers[--noOfC]=null;
		return true;
			}
		else
			return false;
		
	}*/
	
	public void display() {
		System.out.println("The Spa name is: "+name+", and it is located in: "+branch);
		System.out.println("The no. of Customers: "+noOfC);
		
		
	}
	

	public boolean isCustomer(String number){
	   for (int i = 0; i < getNoOfC(); i++){
              if (number != customer[i].getPhoneNum())
		      return false;
	      else
		      return true;
	   }
	}
   
}


