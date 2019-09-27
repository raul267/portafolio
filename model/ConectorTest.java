package model;

public class ConectorTest {
public static void main (String... args)throws Exception{

	System.out.println("Test - Conector ojdbc");
	new ConectorOracle("localhost","portafolio","portafolio","portafolio").execute("insert-query");

}}
