import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private ArrayList<MainPoint> points;
	private int size = 10;
	private Color my_color;
	
	public MainPanel() {
		points = new ArrayList<MainPoint>();
		my_color = Color.BLACK;
		
		// when mouse is dragged
		addMouseMotionListener(
				new MouseMotionAdapter(){
					@Override
					public void mouseDragged(MouseEvent event){
						points.add(new MainPoint(my_color, size, event.getPoint()));	
						repaint();
						
						System.out.println(points.size() + ": x = " + points.get(points.size() - 1).curr_x() + " y = " + points.get(points.size() - 1).curr_y());
					} // points.get(points.size()-1 will give you the most recent points for x and y that your mouse is on
					
				});
		// when mouse is clicked
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				points.add(new MainPoint(my_color, size, event.getPoint()));
				repaint();
				System.out.println(points.size()+": x = "+ points.get(points.size() - 1).curr_x()+ " y = " + points.get(points.size()-1).curr_y());
			}
		});
		
		
			
		
	}
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		for(MainPoint point: points) {
			graphics.setColor(point.getColor());
			graphics.fillOval(point.curr_x(), point.curr_y(), point.mySize(), point.mySize());
		}
		
		
	}
	
	public void set_color(Color my_color, Graphics graphics) {
		this.my_color = my_color;
		
	}
	
	public void mySize(int size) {
		this.size = size;
		
	}
	
	public void clear() {
		points = new ArrayList<MainPoint>();
		repaint();
	}
	

	
	
	
	
	
	
	
	
}