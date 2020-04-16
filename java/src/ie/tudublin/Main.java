package ie.tudublin;


public class Main
{

<<<<<<< HEAD
=======
    public void soundSynthesis()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundSynthesis());
    }
    public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }
    public void helloArrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ArraysExample());
    }

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public void loops()
    {
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    
>>>>>>> 0017d28d50ccce2816eb12a9c15f44a68cc38fe6
    public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}
    
    
    public void sound1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound1());
    }

    public void sound2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Sound2());
    }

    public void audioBands()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AudioBands());
    }

    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
    }

    public void soundMandala()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new SoundMandala());
    }

    public void threeD()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ThreeD());
    }

    public void cafe()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Cafe());
    }
    
    public void dogsCats()
    {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        Cat topcat = new Cat("Topcat");

        Main main = new Main();
		main.bugZap();
        
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because 
        // a & b are object references

    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
		main.cafe();        
    }
}