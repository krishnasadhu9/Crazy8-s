package GAME;

import java.util.*;

public class CardCollection {

	 private String label;
	 private ArrayList<Card> cards;
	
	public CardCollection(String label)
	{
		this.label = label;
	}
	
	 public void addCard(Card card)
	 {
		    cards.add(card);
     }
	 
	 public Card removeCard(int i)
	 {
		 return cards.remove(i);
	 }
	 
	 public int size() {
		    return cards.size();
		  }
	
	 public void display() {
		    System.out.println(label + ": ");
		    for (Card card: cards) {
		      System.out.println(card);
		    }
		    System.out.println();
		  }
}
