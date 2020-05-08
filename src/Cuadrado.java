import processing.core.PApplet;

public class Cuadrado implements Runnable{
	
	
	private int posX;
	private int posY;
	private int tam;
	private int vel;
	private PApplet app;
	
	public Cuadrado (int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam  = 20;
		this.vel  = 2;
		this.app = app;
		
	}
	
	public void draw (int color) {
		
		if (color == 1) {
			app.fill (255);
		} else {
			app.fill(0);
		}
			
				app.rect (this.posX, this.posY, this.tam, this.tam);
	}
		
	
	
	
	public void mover () {
		
		this.posY -= this.vel;
		
		if (this.posY >= -20) {
			this.vel *= -1;
		}
		
		if (this.posY <= 20) {
			this.vel *= -1;
		}
		
	}


	public void run() {
		
		mover();
	}

}


