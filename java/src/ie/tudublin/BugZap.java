package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
        
        
    }
    
    float playerX = 250; 
    float playerY = 450;
    float playerWidth = 50;

    public void drawPlayer(float x, float y, float w) {
        //instructions to draw bug here
      background(0);
      fill(0,0,255);
      rect(x, y, w, 10);
    }

    int x = 0; // 4 bytes
    
	public void draw() {
        /*
        background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
        triangle(40, 60, 100, 60, 20, 20); // vertices	//get back to normal -changed
        */
        drawPlayer(playerX, playerY, playerWidth);
	}	
	
    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX--;
		}
		if (keyCode == RIGHT)
		{
			playerX++;
		}
		if (key == ' ')
		{
			System.out.println("--------------"); // lasers -- the x coordinates should be half of x and then should be y.
		}
	}	
	
	/*
	public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
    }
    */

    
}