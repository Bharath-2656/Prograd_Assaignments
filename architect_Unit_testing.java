package Programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class architect_Unit_testing
{

	@Test
	void checkCmToCmConversions()
	{
		assertEquals(ArchitectUnitConversions.convert_distance_units("1 cm", "cm"), "1.0 cm");
	}
	@Test
	void checkMToCmConversions()
	{
		assertEquals(ArchitectUnitConversions.convert_distance_units("1 m", "cm"), "100.0 cm");
	}
	@Test
	void checkCmToKmConversions()
	{
		assertEquals(ArchitectUnitConversions.convert_distance_units("100 cm", "km"), "0.001 km");
	}
	@Test
	void checkAdiitionOfMandCm()
	{
		assertEquals(ArchitectUnitConversions.addition_on_distance_units("1 m", "100 cm"), "2.0 m");
	}
	@Test
	void checkAdiitionOfCmandKm()
	{
		assertEquals(ArchitectUnitConversions.addition_on_distance_units("200 cm", "1 km"), "100200.0 cm");
	}
	@Test
	void checkSubtractionOfMandCm()
	{
		assertEquals(ArchitectUnitConversions.subtraction_on_distance_units("1 m", "50 cm"), "0.5 m");
	}
	@Test
	void checkSubtractionOfCmandM()
	{
		assertEquals(ArchitectUnitConversions.subtraction_on_distance_units("2000 cm", "1 m"), "1900.0 cm");
	}
	@Test
	void checkGToGConversions()
	{
		assertEquals(ArchitectUnitConversions.weightconversions("1 g", "g"), "1.0 g");
	}
	@Test
	void checkKgToGConversions()
	{
		assertEquals(ArchitectUnitConversions.weightconversions("0.1 kg", "g"), "100.0 g");
	}
	@Test
	void checkAdiitionOfGgandKg()
	{
		assertEquals(ArchitectUnitConversions.addition_on_weight_units("10 g", "1 kg"), "1010.0 g");
	}
	@Test
	void checkSubtractionOfKgandG()
	{
		assertEquals(ArchitectUnitConversions.subtraction_on_weight_units("1.5 kg", "500 g"), "1.0 kg");
	}
	@Test
	void checkCelciusToFarenheitConversion()
	{
		assertEquals(ArchitectUnitConversions.convert_Celcius_To_Farenheit(0.0), 32.0);
	}
	@Test
	void checkKelvinToCelciusConversion()
	{
		assertEquals(ArchitectUnitConversions.convert_Kelvin_To_Celcius(0.0), -273.0);
	}
	
}
