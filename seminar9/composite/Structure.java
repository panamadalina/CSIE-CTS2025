package composite;

import java.util.ArrayList;

public class Structure extends ANode{
	ArrayList<ANode> structure = new ArrayList<>();
	String nameStructure;
	

	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}



	@Override
	String getName() {
		throw new UnsupportedOperationException();
	}

	@Override
	float getPrice() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInfo() {
		String info =this.nameStructure+"\n";
		
		for(ANode nod:structure) {
			info += " "+nod.getInfo() + "\n";
		}
		
		return info;
	}

	@Override
	public void addNode(ANode elem) {
		structure.add(elem);
	}

	@Override
	public void removeNode(ANode elem) {
		structure.remove(elem);
	}

	@Override
	public ANode getNode(int i) {
		return structure.get(i);
	}

}
