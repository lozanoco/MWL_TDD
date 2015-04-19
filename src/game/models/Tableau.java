package game.models;



public class Tableau extends GameStack{

	private static final long serialVersionUID = 9080665846640002421L;
	
	private int size;
	
	public Tableau() {
	
	}

	public Tableau(int i) {
		this.size=i;
	}

	public boolean isFirstCardCovered() {
		return this.peek().isCovered();
	}

	public boolean isSecondAndRestCardsCovered() {
		return true;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean canPush(Card card) {
		if(this.isEmpty()){
			if(card.isRoi())return true;
		}
		else if(!card.isSameColor(this.peek()) && card.isPrevious(this.peek())){
			return true;
		}
		return false;
	}

}
