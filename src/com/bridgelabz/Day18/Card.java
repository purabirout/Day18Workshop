package com.bridgelabz.Day18;
public class Card {
	 private Rank rank;
	    private Suit suit;

	    public Card (Suit suit, Rank rank) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public String toString() {
	        return suit + "" + rank;
	    }

		public Rank getRank() {
			return rank;
		}

		public void setRank(Rank rank) {
			this.rank = rank;
		}

		public Suit getSuit() {
			return suit;
		}

		public void setSuit(Suit suit) {
			this.suit = suit;
		}	
	    
}
