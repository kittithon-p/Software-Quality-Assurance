package Bottom_up_integration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Top_down_integration.List_Stubs;

class Bottom_up_test {
	
	@BeforeEach
	public void setUp() throws Exception {
		List_Driver List_Driver = new List_Driver();
	}

	//PrintSocialInsuranceFee
		@Test
		void PrintSocialInsuranceFee_14000(){
			assertEquals("Social Insurance Fee: 750.0", List_Driver.PrintSocialInsuranceFee(750));
		}
		@Test
		void PrintSocialInsuranceFee_17000(){
			assertEquals("Social Insurance Fee: 800.0", List_Driver.PrintSocialInsuranceFee(800));
		}
		@Test
		void PrintSocialInsuranceFee_22000(){
			assertEquals("Social Insurance Fee: 1000.0", List_Driver.PrintSocialInsuranceFee(1000));
		}
			
	//CalculateSocialInsuranceFee
		@Test
		void CalculateSocialInsuranceFee_14000() {
			assertEquals(750, List_Driver.CalculateSocialInsuranceFee_14000(14000));
		}
		@Test
		void CalculateSocialInsuranceFee_17000() {
			assertEquals(800, List_Driver.CalculateSocialInsuranceFee_17000(17000));
		}
		@Test
		void CalculateSocialInsuranceFee_22000() {
			assertEquals(1000, List_Driver.CalculateSocialInsuranceFee_22000(22000));
		}
		
	//PrintOT
		@Test
		void PrintOT_14000(){
			assertEquals("Over Time: 5.0", List_Driver.PrintOT(5));
		}
		@Test
		void PrintOT_17000(){
			assertEquals("Over Time: 5.0", List_Driver.PrintOT(5));
		}
		@Test
		void PrintOT_22000(){
			assertEquals("Over Time: 5.0", List_Driver.PrintOT(5));
		}
	//CalculateOT
		@Test
		void CalculateOT_14000() {
			assertEquals(1000, List_Driver.CalculateOT_14000(14000, 5));
		}
		@Test
		void CalculateOT_17000() {
			assertEquals(1250, List_Driver.CalculateOT_17000(17000, 5));
		}
		@Test
		void CalculateOT_22000() {
			assertEquals(1500, List_Driver.CalculateOT_22000(22000, 5));
		}
		
	//PrintTax
		@Test
		void PrintTax_14000() {
			assertEquals("Tax: 450.0", List_Driver.PrintTax(450));
		}
		@Test
		void PrintTax_17000() {
			assertEquals("Tax: 912.5", List_Driver.PrintTax(912.5));
		}
		@Test
		void PrintTax_22000() {
			assertEquals("Tax: 1645.0", List_Driver.PrintTax(1645));
		}
	//CalculateTax
		@Test
		void CalculateTax_14000(){
			assertEquals(450, List_Driver.CalculateTax_14000(14000, 5));
		}
		@Test
		void CalculateTax_17000(){
			assertEquals(912.5, List_Driver.CalculateTax_17000(17000, 5));
		}
		@Test
		void CalculateTax_22000(){
			assertEquals(1645, List_Driver.CalculateTax_22000(22000, 5));
		}
		
		
	//CalculateNetSalary
		@Test
		void CalculateNetSalary_14000() {
			assertEquals(13800,List_Driver.CalculateNetSalary_14000(14000, 5));
		}
		@Test
		void CalculateNetSalary_17000() {
			assertEquals(16537.5,List_Driver.CalculateNetSalary_17000(17000, 5));
		}
		@Test
		void CalculateNetSalary_22000() {
			assertEquals(20855,List_Driver.CalculateNetSalary_22000(22000, 5));
		}
}
