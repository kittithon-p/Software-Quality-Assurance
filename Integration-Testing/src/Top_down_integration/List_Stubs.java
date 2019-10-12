package Top_down_integration;

public class List_Stubs {
	
	//CalculateSocialInsuranceFee_14000
		public static double StubCalculateSocialInsuranceFee_14000(double salary) {
			return 750;	
		}
		public static double StubCalculateOT_14000(double salary, double hour){
			return 1000;
		}
		public static double StubCalculateTax_14000(double salary, double OT) {
			return 450;
		}
		public static double CalculateNetSalary_14000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsuranc = StubCalculateSocialInsuranceFee_14000(salary);
			double OT= StubCalculateOT_14000(salary, extrahour);
			double tax = StubCalculateTax_14000(salary, OT);
							
			netsalary = (salary+OT)-tax-socialinsuranc;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}	
	//CalculateSocialInsuranceFee_17000
		public static double StubCalculateSocialInsuranceFee_17000(double salary) {
			return 800;	
		}
		public static double StubCalculateOT_17000(double salary, double hour){
			return 1250;
		}
		public static double StubCalculateTax_17000(double salary, double OT) {
			return 912.5;
		}
		public static double CalculateNetSalary_17000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsuranc = StubCalculateSocialInsuranceFee_17000(salary);
			double OT= StubCalculateOT_17000(salary, extrahour);
			double tax = StubCalculateTax_17000(salary, OT);
							
			netsalary = (salary+OT)-tax-socialinsuranc;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}			
	//CalculateSocialInsuranceFee_22000
		public static double StubCalculateSocialInsuranceFee_22000(double salary) {
			return 1000;	
		}
		public static double StubCalculateOT_22000(double salary, double hour){
			return 1500;
		}
		public static double StubCalculateTax_22000(double salary, double OT) {
			return 1645;
		}
		public static double CalculateNetSalary_22000(double salary, double extrahour)
		{	double netsalary = 0.0;
			double socialinsuranc = StubCalculateSocialInsuranceFee_22000(salary);
			double OT= StubCalculateOT_22000(salary, extrahour);
			double tax = StubCalculateTax_22000(salary, OT);
							
			netsalary = (salary+OT)-tax-socialinsuranc;
			
			System.out.println("Net Salary: " + netsalary);
		
			return netsalary;
		}
	
	
	//CalculateSocialInsuranceFee
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
		
		public static String  PrintSocialInsuranceFee(double fee)
		{	
			System.out.println("Social Insurance Fee: " + fee);
			return "Social Insurance Fee: "+fee;
		}
	
	
	//CalculateOT
		public static double CalculateOT(double salary, double hour)
		{	double OT = 0.0;
			int rate = 0;
			
			if (salary >= 20000)
			{	
				rate = 300;			
			}
			else if ((salary >= 15000)&&(salary < 20000))
			{	
				rate = 250;			
			}
			else 
			{	
				rate = 200; 
			}
			
			OT = hour*rate;
			
			PrintOT(OT);
			
			return OT;
		}
		public static String PrintOT(double OT)
		{	
			System.out.println("Over Time: " + OT);
			return "Over Time: "+OT;
		}
	
	
	//CalculateTax
		public static double CalculateTax(double salary, double OT)
		{	double tax = 0.0;
			double income = salary + OT;
			double taxRate = 0.0;
			
			if (income >= 20000)
			{	taxRate = 0.07;			
			}
			else if ((income >= 15000)&&(income < 20000))
			{	taxRate = 0.05;			
			}
			else 
			{	taxRate = 0.03; 
			}
			tax = income*taxRate;
			
			PrintTax(tax);
			
			return tax;
		}
		public static String PrintTax(double tax)
		{	System.out.println("Tax: " + tax);
		return "Tax: "+tax;		
		}
}
