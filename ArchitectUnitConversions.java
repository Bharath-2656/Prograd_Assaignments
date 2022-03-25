package Programs;

import java.util.Scanner;

import org.junit.validator.PublicClassValidator;

public class ArchitectUnitConversions {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(convert_Kelvin_To_Celcius(0.0));
	}
	public static String convert_distance_units(String input,String output_unit)
	{
		String[] result = input.split(" ");
		float value=Float.parseFloat(result[0]);
		if(result[1].equals("cm"))
		{
			if(output_unit.equals("cm"))
			{
				String s=Float.toString(value)+" cm";
				return s;
			}
			else if(output_unit.equals("m"))
			{
				String s=Float.toString(value/100)+" m";
				return s;
			}
			else if(output_unit.equals("km")) 
			{
				String s=Float.toString(value/100000)+" km";
				return s;
			}
			return "Invalid";
		}
		else if (result[1].equals("m")) 
		{
			if(output_unit.equals("cm"))
			{
				String s=Float.toString(value*100)+" cm";
				return s;
			}
			else if (output_unit.equals("m"))
			{
				String s=Float.toString(value)+" m";
				return s;
			}
			else if (output_unit.equals("km")) 
			{
				String s=Float.toString(value/1000)+" km";
				return s;
			}
			return "Invalid";
		}
		else if (result[1].equals("km")) 
		{
			if(output_unit.equals("cm"))
			{
				String s=Float.toString(value*100000)+" cm";
				return s;
			}
			else if (output_unit.equals("m"))
			{
				String s=Float.toString(value*1000)+" m";
				return s;
			}
			else if (output_unit.equals("km")) 
			{
				String s=Float.toString(value)+" km";
				return s;
			}
			return "Invalid";
		}
		return "Invalid";
	}
	public static String addition_on_distance_units(String input,String output)
	{
		String[] input_string = input.split(" ");
		float valueOne=Float.parseFloat(input_string[0]);
		String[] output_string = output.split(" ");
		float valueTwo=Float.parseFloat(output_string[0]);
		if(input_string[1].equals("cm"))
		{
			if(output_string[1].equals("m"))
			{
				String s=Float.toString((valueTwo*100)+valueOne)+" cm";
				return s;
			}
			if(output_string[1].equals("km"))
			{
				String s=Float.toString((valueTwo*100000)+valueOne)+" cm";
				return s;
			}
			return "Invalid";
		}
		else if(input_string[1].equals("m"))
		{
			if(output_string[1].equals("cm"))
			{
				String s=Float.toString((valueTwo/100)+valueOne)+" m";
				return s;
			}
			if(output_string[1].equals("km"))
			{
				String s=Float.toString((valueTwo*1000)+valueOne)+" m";
				return s;
			}
			return "Invalid";
		}
		else if(input_string[1].equals("km"))
		{
			if(output_string[1].equals("cm"))
			{
				String s=Float.toString((valueTwo/100000)+valueOne)+" km";
				return s;
			}
			if(output_string[1].equals("m"))
			{
				String s=Float.toString((valueTwo/1000)+valueOne)+" km";
				return s;
			}
			return "Invalid";
		}
		return "Invalid";
	}
	public static String subtraction_on_distance_units(String input,String output)
	{
		String[] input_string = input.split(" ");
		float valueOne=Float.parseFloat(input_string[0]);
		String[] output_string = output.split(" ");
		float valueTwo=Float.parseFloat(output_string[0]);
		if(input_string[1].equals("cm"))
		{
			if(output_string[1].equals("m"))
			{
				String s=Float.toString(valueOne-(valueTwo*100))+" cm";
				return s;
			}
			if(output_string[1].equals("km"))
			{
				String s=Float.toString(valueOne-(valueTwo*100000))+" cm";
				return s;
			}
			return "Invalid";
		}
		else if(input_string[1].equals("m"))
		{
			if(output_string[1].equals("cm"))
			{
				String s=Float.toString(valueOne-(valueTwo/100))+" m";
				return s;
			}
			if(output_string[1].equals("km"))
			{
				String s=Float.toString(valueOne-(valueTwo*1000))+" m";
				return s;
			}
			return "Invalid";
		}
		else if(input_string[1].equals("km"))
		{
			if(output_string[1].equals("cm"))
			{
				String s=Float.toString((float)valueOne-(valueTwo/100000))+" km";
				return s;
			}
			if(output_string[1].equals("m"))
			{
				String s=Float.toString(valueOne-(valueTwo/1000))+" km";
				return s;
			}
			return "Invalid";
		}
		return "Invalid";
	}
	public static String weightconversions(String input, String output_unit)
	{	
		String[] result = input.split(" ");
		float value=Float.parseFloat(result[0]);
			if(result[1].equals("g"))
			{
				if(output_unit.equals("g"))
				{
					String s=Float.toString(value)+" g";
					return s;
				}
				else if (output_unit.equals("kg")) 
				{
					String s=Float.toString(value/1000)+" kg";
					return s;
				}
				return "Invalid";
			}
			else if (result[1].equals("kg")) 
			{
				if(output_unit.equals("g"))
				{
					String s=Float.toString(value*1000)+" g";
					return s;
				}

				else if (output_unit.equals("kg")) 
				{
					String s=Float.toString(value)+" kg";
					return s;
				}
				return "Invalid";
			}
			return "Invalid";
		}
	public static String addition_on_weight_units(String input,String output)
	{
		String[] input_string = input.split(" ");
		float valueOne=Float.parseFloat(input_string[0]);
		String[] output_string = output.split(" ");
		float valueTwo=Float.parseFloat(output_string[0]);
				if(input_string[1].equals("g"))
				{
					if(output_string[1].equals("kg"))
					{
						String s=Float.toString((valueTwo*1000)+valueOne)+" g";
						return s;
					}
					return "Invalid";
				}
				else if(input_string[1].equals("kg"))
				{
					if(output_string[1].equals("g"))
					{
						String s=Float.toString((valueTwo/1000)+valueOne)+" kg";
						return s;
					}
					return "Invalid";
				}
				return "Invalid";
			}
	public static String subtraction_on_weight_units(String input,String output)
	{
		String[] input_string = input.split(" ");
		float valueOne=Float.parseFloat(input_string[0]);
		String[] output_string = output.split(" ");
		float valueTwo=Float.parseFloat(output_string[0]);
				if(input_string[1].equals("g"))
				{
					if(output_string[1].equals("kg"))
					{
						String s=Float.toString(valueOne-(valueTwo*1000))+" g";
						return s;
					}
					return "Invalid";
				}
				else if(input_string[1].equals("kg"))
				{
					if(output_string[1].equals("g"))
					{
						String s=Float.toString(valueOne-(valueTwo/1000))+" kg";
						return s;
					}
					return "Invalid";
				}
				return "Invalid";
			}
		public static double convert_Celcius_To_Farenheit(Double celcius)
		{
			double farenheit = (((celcius)*1.8)+32);
			return(farenheit);
		}
		public static double convert_Kelvin_To_Celcius(Double kelvin)
		{
			double celcius = kelvin-273;
			return(celcius);
		}
	}


