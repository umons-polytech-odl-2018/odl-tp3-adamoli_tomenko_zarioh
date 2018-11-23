package be.ac.umons.odl;

import java.awt.*;

public class Hexagone extends ConvexPolygon {
	public Hexagone(Point start, Point end) {
		super(new Point[]{
			new Point(Math.min(start.getX(),end.getX())+Math.abs(start.getX() - end.getX())/2, Math.min(start.getY(),end.getY())),
			new Point(Math.min(start.getX(),end.getX()), Math.min(start.getY(),end.getY())+Math.abs(start.getY() - end.getY())/4),
			new Point(Math.min(start.getX(),end.getX()), Math.max(start.getY(),end.getY())-(Math.abs(start.getY() - end.getY())/(4))),
			new Point(Math.max(start.getX(),end.getX())-Math.abs(start.getX() - end.getX())/2, Math.max(start.getY(),end.getY())),
			new Point(Math.max(start.getX(),end.getX()), Math.max(start.getY(),end.getY())-Math.abs(start.getY() - end.getY())/4),
			new Point(Math.max(start.getX(),end.getX()), Math.min(start.getY(),end.getY())+(Math.abs(start.getY() - end.getY())/(4)))
		});
	}
}

