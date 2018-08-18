package com.addcode.nissan;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Testfile {

	
private addcode add ;
	
	@Before
	public void setup() {
		add = new addcode() ;
	}

	@Test
	public void numbericOnenumericTwo() {
		Assert.assertEquals( "True", "4.0", add.func("1.0","3"  ) ) ;
	}
	@Test
	public void numbericOneStringTwo() {
		Assert.assertEquals( "True", "Invalid", add.func("1.0","dsdfs"  ) ) ;
	}
	
	@Test
	public void stringOnenumericTwo() {
		Assert.assertEquals( "True", "Invalid", add.func("sdsd","3.0"  ) ) ;
	}
	@Test
	public void stringOneStringTwo() {
		Assert.assertEquals( "True", "Invalid", add.func("asas","sass"  ) ) ;
	}
	
	
	
	
}
