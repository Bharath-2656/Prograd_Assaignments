package Programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class validate_ipv4_testing {

	
	@Test
	public void test1() {
		assertTrue(ValidateIpv4Address.validateIp("1.1.1.1"));
		
	}
	@Test
	public void test2()
	{
		assertTrue(ValidateIpv4Address.validateIp("192.168.1.1"));
	}
	@Test
	public void test3()
	{
		assertTrue(ValidateIpv4Address.validateIp("10.0.0.1"));
	}
	@Test
	public void Checking_valid_ip()
	{
		assertTrue(ValidateIpv4Address.validateIp("127.0.0.1"));
	}
	@Test
	public void test_to_check_0()
	{
		assertFalse(ValidateIpv4Address.validateIp("0.0.0.0"));
	}
	@Test
	public void test_to_check_255_at_last_index()
	{
		assertFalse(ValidateIpv4Address.validateIp("255.255.255.255"));
	}
	@Test
	public void test_to_check_0_at_last_index()
	{
		assertFalse(ValidateIpv4Address.validateIp("1.1.1.0"));
	}
	@Test
	public void test_to_check_32_bits_of_ip()
	{
		assertFalse(ValidateIpv4Address.validateIp("10.0.1"));
	}

}
