package composite;

public abstract class ANode {
	abstract String getName();
	abstract float getPrice();
	
	public String getInfo() {
		return " "+this.getName() + " " + this.getPrice();
	}
	
	public void addNode(ANode elem) {
		throw new UnsupportedOperationException();
	}
	
	public void removeNode(ANode ANode) {
		throw new UnsupportedOperationException();
	}
	
	public ANode getNode(int i) {
		throw new UnsupportedOperationException();
	}
}
