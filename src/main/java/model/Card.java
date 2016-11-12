package model;

import model.Face.Rank;

public class Card {

	private Face face;
	
	private boolean flippedUp;
	
	public Card(Face face) { 
		this.face = face;
		this.flippedUp = false;
	}
	
	public boolean isFlippedUp() {
		return flippedUp;
	}
	
	public void setFlippedUp(boolean flippedUp) {
		this.flippedUp = flippedUp;
	}
	
	public Face getFace() {
		return face;
	}

	public boolean isAce() {
        return face.getRank() == Rank.ACE;
    }

    public boolean isKing() {
        return face.getRank() == Rank.KING;
    }
    
    public boolean isImmediateHigher(Card card) {
        assert card != null;
        return this.face.isImmediateHigher(card.face);
    }
    
    public boolean isImmediateLess(Card card) {
        assert card != null;
        return this.face.isImmediateLess(card.face);
    }
}
