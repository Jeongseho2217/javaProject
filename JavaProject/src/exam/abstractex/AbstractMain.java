package exam.abstractex;

public class AbstractMain {

	public static void main(String[] args) {
		
		Circle c = new Circle(); 
		Poly p = new Poly(); 
		Rect r = new Rect(); 
		
		p.draw("red");
		c.draw("blue");
		r.draw("green");
	}
}
