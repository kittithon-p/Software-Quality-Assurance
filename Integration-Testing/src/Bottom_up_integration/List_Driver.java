package Bottom_up_integration;


public class List_Driver {
	
	//PrintSocialInsuranceFee
		public static String PrintSocialInsuranceFee(double fee)
		{	
			System.out.println("Social Insurance Fee: " + fee);
			return "Social Insurance Fee: " + fee;		
		}
		
		public static double CalculateSocialInsuranceFee(double salary)
		{	double fee = 0.0;
			if (salary >= 20000)
			{	
				fee = 1000;			
			}
			else if ((salary >= 15000)&&(salary < 20000))
			{	
				fee = 800;			
			}
			else 
			{	
				fee = 750; 
			}
			
			PrintSocialInsuranceFee(fee);
			
			return fee;
		}
	
		
	//CalculateSocialInsuranceFee
		public static double CalculateNetSalary_14000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsurance = CalculateSocialInsuranceFee_14000(salary);
			double OT = CalculateOT_14000(salary, extrahour);
			double tax = CalculateTax_14000(salary, OT);
			
			netsalary = (salary+OT)-tax-socialinsurance;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}
		public static double CalculateSocialInsuranceFee_14000(double salary) {
			return 750;
		}
		public static double CalculateOT_14000(double salary, double hour) {
			return 1000;
		}
		public static double CalculateTax_14000(double salary, double OT) {
			return 450;
		}
	//17000
		public static double CalculateNetSalary_17000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsurance = CalculateSocialInsuranceFee_17000(salary);
			double OT = CalculateOT_17000(salary, extrahour);
			double tax = CalculateTax_17000(salary, OT);
			
			netsalary = (salary+OT)-tax-socialinsurance;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}
		public static double CalculateSocialInsuranceFee_17000(double salary) {
			return 800;
		}
		public static double CalculateOT_17000(double salary, double hour) {
			return 1250;
		}
		public static double CalculateTax_17000(double salary, double OT) {
			return 912.5;
		}
	//22000
		public static double CalculateNetSalary_22000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsurance = CalculateSocialInsuranceFee_22000(salary);
			double OT = CalculateOT_22000(salary, extrahour);
			double tax = CalculateTax_22000(salary, OT);
			
			netsalary = (salary+OT)-tax-socialinsurance;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}
		public static double CalculateSocialInsuranceFee_22000(double salary) {
			return 1000;
		}
		public static double CalculateOT_22000(double salary, double hour) {
			return 1500;
		}
		public static double CalculateTax_22000(double salary, double OT) {
			return 1645;
		}
		
		
	//PrintOT
		public static String PrintOT(double OT)
		{	
			System.out.println("Over Time: " + OT);
			return "Over Time: " + OT;
		}
		
	//CalculateOT
		public double CalculateOT(double salary, double hour)
		{	double OT = 0.0;
			int rate = 0;
			
			if (salary >= 20000)
			{	rate = 300;			
			}
			else if ((salary >= 15000)&&(salary < 20000))
			{	rate = 250;			
			}
			else 
			{	rate = 200; 
			}
			
			OT = hour*rate;
						
			return OT;
		}
		
	//PrintTax
		public static String PrintTax(double tax)
		{	
			System.out.println("Tax: " + tax);
			return "Tax: " + tax;		
		}
		
	//
		public static double CalculateTax(double salary, double OT)
		{	double tax = 0.0;
			double income = salary + OT;
			double taxRate = 0.0;
			
			if (income >= 20000)
			{	
				taxRate = 0.07;			
			}
			else if ((income >= 15000)&&(income < 20000))
			{	
				taxRate = 0.05;			
			}
			else 
			{	
				taxRate = 0.03; 
			}
			tax = income*taxRate;
					
			return tax;
		}
	
}
