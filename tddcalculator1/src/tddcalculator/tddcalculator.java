package tddcalculator;

public class tddcalculator

{
private boolean status; 
	
	public tddcalculator()
	{
		this.status = true;
	
		
	}
	
	public boolean getStatus()
	{
		return status;
	
		
	}

	public int addition(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public int subtraction(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public int multiplication(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;	
	}

	   public int division(int i, int j)
	   {
		   if (j == 0) {
			   throw new IllegalArgumentException("Cannot divide by 0!");
		   }
	            return i / j;
	        }

	public int mod(int i, int j) {
		// TODO Auto-generated method stub
		return i%j;
	}

	
	}
	    


	
	


		

