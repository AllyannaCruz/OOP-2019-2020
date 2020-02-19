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
	}// end keyPressed()


	public void loops1()
	{
		stroke(255);
		int numLines = (int) (30 * (mouseX / (float)width));
		float gap = width / (float) numLines;
		
		for(int i = 0; i <= numLines ; i++)
		{
			float x = i * gap;
			line(x, 0, width - x, height);
			line(0, x, width, height - x);
		}
	}// end loops1()


	public void draw()
	{	
		background(200);		// light grey
		stroke(0); // black lines
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
		while(i < -30)
		{
			i ++;
		}// end while
		
		for(int j = -10; j < 100 ; j++)
		{
			line(j, j, -85, -300);
		} // end for
	
		for(int y = 10 ; y <= 50 ; y += 10)
		{
			line(y, y, 85, 300); // y is the origin (middle bit -- don't change, line must start from here)
		}//end for

		int yy = 10;
		while(yy <= 40)
		{
			line(350, yy, 450, yy);
			yy += 10;
		}// end while
		
	
	}//end draw()
} // end Loops()
