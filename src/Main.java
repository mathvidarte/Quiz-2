import processing.core.PApplet;

public class Main extends PApplet {
	
	Cuadrado[][] matriz = new Cuadrado[20][30];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");

	}
	
	public void settings () {
		size (600, 400);
	}
	
	public void setup () {
		
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 30; j++) {
				matriz[i][j] = new Cuadrado(j*20,i*20, this);
			}
		}
		
		
		
	}
	
	public void draw () {
		background (120);
		
	
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 30; j++) {
				
				if(i%2==0) {
					if (j%2==0) 
					matriz[i][j].draw(0);	
					else matriz[i][j].draw(1);
					} else {
		
					if (j%2==0) 
						matriz[i][j].draw(1);
					else matriz[i][j].draw(0);
					}
			}
		}
		
		//Thread c = new Thread (new Cuadrado(), "movimiento");
				
	
		}
				
				
			
		
	
	
	public void mousePressed () {
		
		
	}

}
