import java.util.ArrayList;


public class Cell {
	private boolean alive;
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public ArrayList<Boolean> getPredecessors() {
		return predecessors;
	}
	public void setPredecessors(ArrayList<Boolean> predecessors) {
		this.predecessors = predecessors;
	}
	private ArrayList<Boolean> predecessors = new ArrayList<Boolean>();
	public Cell(boolean alive) {
		super();
		this.alive = alive;
	}
	
	public void appendPredecessor(boolean bool){
		this.predecessors.add(bool);
	}
}
