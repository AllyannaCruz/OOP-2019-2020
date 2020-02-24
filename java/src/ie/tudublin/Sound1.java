package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sound1 extends PApplet
{	
	Minim minim;
	//AudioInput ai; - microphone

	as = minim.loadSample ("heroPlanet.mp3")// audio file
	//as.trigger(); // for the audio to play
	colorMode(HSB);

	public void settings()
	{
		size(1024, 500);
	}

	public void setup() 
	{
		minim = new Minim(this);
		ai = minim.getLineIn(Minim.MONO, width, 44100, 16);

		colorMode(HSB);
	}

	//lerp (a,b,t) linear interpelation (10,20,1)
	//lerpcircley in solution code  moves circle to make circle look better, smoother -- moves 10% closer

	public void draw()
	{	
		background(0);		
		stroke(255);
		float cy = height / 2;
		
		for(int i = 0 ; i < ai.bufferSize() ; i ++)
		{
			float average;
			float sum = 0;
			stroke(
				map(i, 0, ai.bufferSize(), 0, 255)
				, 255
				, 255
			);
			line(i, cy, i, cy + ai.left.get(i) * cy);
			sum += abs(ai.left.get(i));
	
		}
		float average = sum / ai.bufferSize();

		float w  = average * 1000;
		noStroke();
		fill (

		);

		float radius = average * cy;
		ellipse(width / 2, cy, w,w); 
	}

	public void Avg() // Average of samples
	{

	}
}
