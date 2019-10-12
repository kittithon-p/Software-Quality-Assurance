import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_flzz_buzz {

	
	Main m = new Main();
	
	String i1 = m.getInt(1);
	String i2 = m.getInt(2);
	String i3 = m.getInt(3);
	String i4 = m.getInt(4);
	String i5 = m.getInt(5);
	String i6 = m.getInt(6);
	String i7 = m.getInt(7);
	String i8 = m.getInt(8);
	String i9 = m.getInt(9);
	String i10 = m.getInt(10);
	String i11 = m.getInt(11);
	String i12 = m.getInt(12);
	String i13 = m.getInt(13);
	String i14 = m.getInt(14);
	String i15 = m.getInt(15);
	
	@Test
	void intput_1_output_1() {
		assertEquals( "1", i1);	
	}
	
	@Test
	void intput_2_output_2() {
		assertEquals( "2", i2);	
	}
	
	@Test
	void intput_3_output_Fizz() {
		assertEquals( "Fizz",i3);	
	}
	
	@Test
	void intput_4_output_4() {
		assertEquals( "4", i4);	
	}
	
	@Test
	void intput_5_output_Buzz() {
		assertEquals( "Buzz", i5);	
	}
	
	@Test
	void intput_6_output_Fizz() {
		assertEquals( "Fizz", i6);	
	}
	
	@Test
	void intput_7_output_7() {
		assertEquals( "7", i7);	
	}
	
	@Test
	void intput_8_output_8() {
		assertEquals( "8", i8);	
	}
	
	@Test
	void intput_9_output_Fizz() {
		assertEquals( "Fizz", i9);	
	}
	
	@Test
	void intput_10_output_Buzz() {
		assertEquals( "Buzz", i10);	
	}
	
	@Test
	void intput_11_output_11() {
		assertEquals( "11", i11);	
	}
	
	@Test
	void intput_12_output_Fizz() {
		assertEquals( "Fizz", i12);	
	}
	
	@Test
	void intput_13_output_13() {
		assertEquals( "13", i13);	
	}
	
	@Test
	void intput_14_output_14() {
		assertEquals( "14", i14);	
	}
	
	@Test
	void intput_15_output_FizzBuzz() {
		assertEquals( "FizzBuzz", i15);	
	}

}
