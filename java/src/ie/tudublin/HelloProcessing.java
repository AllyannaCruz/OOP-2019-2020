package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{	
	public void settings()
	{
		size(500, 500); //from papplet
	}

	public void setup() { // loop 60 times per second
	}

	/* --- Example og
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	/*public void draw() {
		background(0, 255, 0); //green //red (255,0,0)
		//noStroke(); // no outline
		stroke(0,0,255); //outline e.g blue
		//background(0);// black
		//background(255); //all white // one param e.g (127, etc.. grey colour)
		line(10, 10, 100, 100); //draw line // x1,y1,x2 ,y2
		point(50, 50); // x, y
		fill(0,255,255); // aqua fill shape
		noStroke();
		ellipse(100,200,100,50); // draw oval // cx, cy, w, h

		rect(70, 150, 90, 10); //tlx, tly, w, h
		triangle(150, 90, 200, 100, 100, 250); // vertices x,y x,y x,y
		//background(0, 255, 0); putting bg here, clears whole screen to that colour, i.e green
	}
	*/

	public void draw() {
		background(255,0,0);
		ellipse(250,350,400,200); //black circle
		fill(0,255,255);// aqua
		triangle(100, 50, 150, 2000, 2000, 4000);
		fill(255,255,0); // yellow
		noStroke();
		ellipse(200,500,400,200); //yellow circle
		fill(127);
		ellipse(50,100,400,200); // gray circle
		fill(0);

	}
	//colorMode(HSPS) -- try make eye to blink


	int x = 0; // 4 bytes
	
	/*public void draw()
	{	
		
		background(0);
		noStroke();
		fill(255);
		ellipse(x, mouseY, 50, 50);		
		x ++;
	}
	*/
}
