package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		stroke(255);
		//line(10, 10, 350, 150); x1,y1 x2, y2
		//line(10, 20, 350, 160);
		//line(10, 30, 350, 170);
		//line(10, 40, 100, 40);

			//same as doing above code
		/*for(aline = 2; aline <= 40 ; aline+= 10)
		{
			line(200, aline, 100, aline);
					
		}
		
		int aline2 = 10;
		while(aline2 <= 40)
		{
			line(300, aline, 400, aline);
			aline += 10;
		}
		*/
		int i = 0;
		while(i < 10)
		{
			i ++;
		}
		
		for(int j = 0; j < 100 ; j++)
		{
			//j++;
		}
	

		for(int y = 0 ; y <= 50 ; y += 11)
		{
			line(y, y, 100, 300); // y is the origin (middle bit -- don't change, line must start from here)
		}

		int yy = 10;
		while(yy <= 40)
		{
			line(350, yy, 450, yy);
			yy += 10;
		}
		
	
	}
}
