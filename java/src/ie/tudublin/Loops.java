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
		//line(10, 10, 350, 150);
		//line(10, 20, 350, 160);
		//line(10, 30, 350, 170);
		//line(10, 40, 100, 40);

			//same as doing above code
			for(y = 2=; y <= 40 ; y+= 10)
			{
				line(200, yy, 100, yy);
						
			}
			
			int yy = 10;
			
			int i = 0;
			while(i < 10)
			{
				i ++;
			}
			
			for(int j = 0; j < 100 ; j++)
			{
				
			}
		}

		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10;
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}
		
	
	}
}
