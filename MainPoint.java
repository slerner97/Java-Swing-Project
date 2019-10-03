import java.awt.Color;
import java.awt.Point;

public class MainPoint {
	
	private final Point point;
	private final Color my_color;
	private final int size;
	
	
	public MainPoint(Color color, int size, Point point) {
		this.my_color = color;
		this.size = size;
		this.point = point;
		
	}
	
	public int mySize() {
		return this.size;
		
	}
	
	public Color getColor() {
		return this.my_color;
	}
	
	public int curr_x() {
		return (int) point.getX();
	}
	
	public int curr_y() {
		return (int) point.getY();
	}
	
	
	
	
	
}
		
	
	
	


