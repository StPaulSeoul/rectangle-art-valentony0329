import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends JPanel {
	private static final long serialVersionUID = 1L;
	public static Dimension size;

	public Rectangle() {
		super();
		// New colors - pass RGBA 0~225
		// Color myColor = new Color(255, 255, 255, 100);
		setBackground(Color.BLACK);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		Graphics2D g2 = (Graphics2D)g;
		g2.setStroke(new BasicStroke(3.0f,
				BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_ROUND));
		g2.setColor(Color.WHITE);
		
		//Rectangle2D r = new Rectangle2D.Double(100, 200, 100, 100);
		
		int NumberOfRectangle = 50;
		
		for(int x = 1; x < NumberOfRectangle; x++) {
				Rectangle2D r = new Rectangle2D.Double(750/x, 450/x, (750-750/x)*2, (450-450/x)*2);
				g2.draw(r);
			}
		}
	

	public void setupDisplay() {
		JFrame application = new JFrame();
		application.add(this);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1440, 900);
		application.setExtendedState(JFrame.MAXIMIZED_BOTH);
		application.setUndecorated(true);
		application.setVisible(true);
		size = application.getSize();
	}

	public static void main(String[] args) {
		Rectangle program = new Rectangle();
		program.setupDisplay();
	}

}
