package be.ac.umons.odl;

public class Circle extends Ellipsis{
	private Point upLeft;
	private int radius;

	public Circle (Point upLeft, int radius) {
		super(upLeft, radius, radius);
		this.upLeft = upLeft;
		this.radius = radius;
	}
}
