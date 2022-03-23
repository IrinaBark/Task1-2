package by.training.training.entity;

public class Test1 {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Test1() {
		x = 0;
		y = 0;
	}

	public Test1(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public void print() {
		System.out.println(" X value: " + x + ", Y value: " + y);
	}

	public int getSum() {
		return x + y;
	}

	public int getBiggest() {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
}
