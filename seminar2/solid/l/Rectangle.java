package seminar2.solid.l;
/*
 * Liskov Substitution Principle
If it looks like a duck, quacks like a duck, but needs batteries – you probably have the wrong abstraction
 */

 public class Rectangle {
	int width;
	int height;
	public void setWidth(int val) {
		System.out.println("set width rectangle");
		this.width=val;
	}
	public void setHeight(int value) {
		System.out.println("set height rectangle");
		this.height=value;
	}
	public int area() {
		return height*width;
	}
}