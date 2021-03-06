package introduction.walk.traditional.random;

import introduction.Walker;
import processing.core.PApplet;

public class TraditionalRandomWalk extends PApplet {

	Walker walker;
	
	public static void main(String[] args) {
		PApplet.main("introduction.walk.traditional.random.TraditionalRandomWalk");
	}
	
	public void settings() {
		size(640,360);
	}
	
	public void setup() {
		background(255);
		walker = new TraditionalRandomWalker(this);
	}
	
	public void draw() {
		walker.step();
		walker.display();
	}
}
