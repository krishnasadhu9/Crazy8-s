package GAME;

import java.util.*;

public class Card {
	
	public static String[] Rank = {
			
			"Ace" , "2" , "3" , "4" , "5" , "6" , "7" , "8" ,"9", "10",
			"Jack", "Queen", "King"
	};
	
	public static String[] Suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
	
	private int rank;
	private int suit;
	
	public Card(int rank, int suit)
	{
		this.rank = rank;
		this.suit = suit;	
	}
	
	public String PrintCard()
	{
		return "The card - " + Rank[rank] + Suit[suit];
	}
	
	
	
	
	

}
