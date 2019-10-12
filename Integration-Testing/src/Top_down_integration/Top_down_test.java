package Top_down_integration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Top_down_test {

	@BeforeEach
		public void setUp() throws Exception {
			List_Stubs List_Stubs = new List_Stubs();
		}
	//CalculateNetSalary
		@Test
		void CalculateNetSalary_14000() {
			double CalculateNetSalary_14000 = List_Stubs.CalculateNetSalary_14000(14000, 5);
			assertEquals(13800, CalculateNetSalary_14000);
		}
		@Test
		void CalculateNetSalary_17000() {
			double CalculateNetSalary = List_Stubs.CalculateNetSalary_17000(17000, 5);
			assertEquals(16537.5, CalculateNetSalary);
		}
		@Test
		void CalculateNetSalary_22000() {
			double CalculateNetSalary = List_Stubs.CalculateNetSalary_22000(22000, 5);
			assertEquals(20855, CalculateNetSalary);
		}
	
	
	//CalculateSocialInsuranceFee
		@Test
		void CalculateSocialInsuranceFee_14000() {
			double CalculateSocialInsuranceFee = List_Stubs.CalculateSocialInsuranceFee(14000);
			assertEquals(750, CalculateSocialInsuranceFee);
		}
		@Test
		void CalculateSocialInsuranceFee_17000() {
			double CalculateSocialInsuranceFee = List_Stubs.CalculateSocialInsuranceFee(17000);
			assertEquals(800, CalculateSocialInsuranceFee);
		}
		@Test
		void CalculateSocialInsuranceFee_22000() {
			double CalculateSocialInsuranceFee = List_Stubs.CalculateSocialInsuranceFee(22000);
			assertEquals(1000, CalculateSocialInsuranceFee);
		}
		
	//PrintSocialInsuranceFee
		@Test
		void PrintSocialInsuranceFee_14000(){
			
		}
		@Test
		void PrintSocialInsuranceFee_17000(){
			
		}
		@Test
		void PrintSocialInsuranceFee_22000(){
			
		}
		
	
	//CalculateOT
		@Test
		void CalculateOT_14000() {
			double CalculateOT = List_Stubs.CalculateOT(14000, 5);
			assertEquals(1000, CalculateOT);
		}
		@Test
		void CalculateOT_17000() {
			double CalculateOT = List_Stubs.CalculateOT(17000, 5);
			assertEquals(1250, CalculateOT);
		}
		@Test
		void CalculateOT_22000() {
			double CalculateOT = List_Stubs.CalculateOT(22000, 5);
			assertEquals(1500, CalculateOT);
		}
	
	//PrintOT
		@Test
		void PrintOT_14000(){
			
		}
		@Test
		void PrintOT_17000(){
			
		}
		@Test
		void PrintOT_22000(){
			
		}
	
	
	//CalculateTax
		@Test
		void CalculateTax_14000(){
			double CalculateTax = List_Stubs.CalculateTax(14000, 5);
			assertEquals(450, CalculateTax);
		}
		@Test
		void CalculateTax_17000(){
			double CalculateTax = List_Stubs.CalculateTax(17000, 5);
			assertEquals(912.5, CalculateTax);
		}
		@Test
		void CalculateTax_22000(){
			double CalculateTax = List_Stubs.CalculateTax(22000, 5);
			assertEquals(1645, CalculateTax);
		}
	//PrintTax
		@Test
		void PrintTax_14000() {
			
		}
		@Test
		void PrintTax_17000() {
			
		}
		@Test
		void PrintTax_22000() {
			
		}

}
