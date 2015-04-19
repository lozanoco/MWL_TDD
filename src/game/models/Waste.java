package game.models;

public class Waste extends GameStack{

	private static final long serialVersionUID = -5001779786602708271L;

	@Override
	public boolean canPush(Card card) {
		if(!card.isCovered()) return true;
		return false;
	}


}
