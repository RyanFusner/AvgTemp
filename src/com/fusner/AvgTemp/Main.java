package com.fusner.AvgTemp;
//Ryan Fusner
// Exercise 1
// 1/18/2018
public class Main
{

    public static void main(String[] args)
    {
	    String cityName = "Columbus";
	    int zip = 43215;
	    double[] temps = {32, 25, 27, 40, 45};
	    double tempTotal = 0;
	    double avgTemp;

	    for (int i=0; i<temps.length; i++)
        {
            tempTotal += temps[i];
        }

        avgTemp = tempTotal/temps.length;

	    System.out.println(cityName);
	    System.out.println(zip);
	    System.out.println(avgTemp);
    }
}
