package be.ac.umons.odl;

import java.awt.*;

public class Ellipsis implements Drawable {

	private Point upLeft;
	private int xAxisLength;
	private int yAxisLength;

	public Ellipsis(Point upLeft, int x, int y) {
		this.yAxisLength=y;
		this.xAxisLength=x;
		this.upLeft=upLeft;
	}

	public double perimeter(){
		return 2*Math.PI*Math.sqrt((Math.pow(xAxisLength,2)+Math.pow(yAxisLength,2))/2);
	}

	public double area(){
		return Math.PI*xAxisLength*yAxisLength;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(upLeft.getX(), upLeft.getY(), xAxisLength, yAxisLength);
	}
}
