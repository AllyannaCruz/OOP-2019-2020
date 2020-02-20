package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

public class ArraysExample extends PApplet
{	

	//float[] rainFall = new float[12]; 
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
		//size(200, 200); for the myMethod() function
	}

	public void setup() 
	{
		for(int i = 0 ; i < rainFall.length; i ++)
		{
			println(months[i] + "\t" + rainFall[i]);
		}

		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		int minIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] < rainFall[minIndex])
			{
				minIndex = i;
			}
		}
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex]);
		
		int maxIndex = 0;
		for(int i = 1 ; i < rainFall.length ; i ++)
		{
			if (rainFall[i] > rainFall[maxIndex])
			{
				maxIndex = i;
			}
		}
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex]);

		// You can also calculate the minimum and max of an arry this way:
		// Note the array is of type Float not float
		// Float are objects float is a primitive type
		Float[] floatArray = {10.0f, 5.0f, 20.0f};
		float min = Collections.min(Arrays.asList(floatArray)); 
		float max = Collections.max(Arrays.asList(floatArray));
		
	}

	void drawBarChart() // can use this to draw out rainbow stripes from week 3
	{
		float w = width / (float) rainFall.length;
		float cGap = 255 / (float) rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0 ; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		//background(0);		
		//colorMode(HSB);	

		//drawBarChart();

		//myMethod();

		drawPieChart();
	}

	//method created, call from draw()
	/*
	public void myMethod()
	{
		background(0);
		//float aLine = width / (float) myLine.length; -- must declare variables in Main.java
		
		line(600, 400, 30, 400); // horizontal line for bar chart
		stroke(255);
		line(50, 20, 50, 400); //vertical line for bar chart

		textSize(12);
		textAlign(BOTTOM);
		text("150", 610, 410); 
		fill(0, 0, 255);
		text("150", 10, 60);
		fill(0, 0, 255);
		
		//float  x1 = map(mouseX, 0, width, 50, 150); -- for  showing spiking in graphs
		
		
	}
	*/

	public void drawPieChart()
	{

	}

}

