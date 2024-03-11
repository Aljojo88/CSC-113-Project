
public class Spa {
	
	private String name;
	private String branch;
	private int noOfC;
	private Customer customer [];
	
	public Spa(name , branch , size) {
		this.name=name;
		this.branch=branch;
		customer = new Customer [size];
	}
	
	public Spa( Spa S ) {
		this.name=S.name;
		this.branch=S.branch;
		this.noOfC=S.noOfC;

		
		Customer arr [] = new Customer[S.customer.length];
		
		for(int i=0 ; i<noOfC ; i++)
			arr[i]=customer[i]; //revise
					
	}
      
	public int CalculatePoint() {
		int point = 0;
		
	  for(int i=0 ; i<nOfC ; i++)
		  if(customer[i].getTotalPrice()>1000)
			  point = 30;
		  else
			  if(customer[i].getTotalPrice()<1000 && customer[i].getTotalPrice()>800)
				  point = 20;
			  else
				  if(customer[i].getTotalPrice()<800 && customer[i].getTotalPrice()>500)
					  point = 10;
	  
				  else
					  if(customer[i].getTotalPrice()<500 && customer[i].getTotalPrice()>200)
						  point = 5;
					  else
						  point = 0;
	  
	  return point;
	}
	
	public boolean addCustomer(Customer C) {
		if(noOfC < customer.length) {
			customer[noOfC++]=C;
		return true;
		}
		else
			return false;
	}
	
	public boolean removeCustomer(int C) {
		for(int i=0 ; i<noOfC ; i++)
			if(customer[i].getIndex()==C) {
				customer[C] = customer [customer.length-1];
		
		customer[--noOfC]=null;
		return true;
			}
		else
			return false;
		
	}
	
	public void display() {
		System.out.println("The Spa name is: "+name+", and it is located in: "+branch);
		System.out.println("The no. of Customers: "+noOfC);
		
		
	}
	
}
