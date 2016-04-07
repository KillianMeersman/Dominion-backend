package Engine;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private Game game = null;
	private String name = null;
	private byte actions = 0;
	private byte buys = 0;
	private int coins = 0;
	private List<Card> deck = new ArrayList<Card>();
	private List<Card> hand = new ArrayList<Card>();
	private List<Card> discardPile = new ArrayList<Card>();
	
	// Player card actions
	private void discardToDeck(int amount) {
		Collections.shuffle(discardPile);
		if (discardPile.size() >= amount) {
			for (int i = 0; i < amount; i++) {
				deck.add(discardPile.get(i));
				discardPile.remove(i);
			}
		}
	}
	
	public Card[] getDeckCards(int amount) {
		Card[] output = new Card[amount];
		
		if (deck.size() >= amount) {
			for (int i = 0; i < amount; i++) {
				output[i] = deck.get(i);
				deck.remove(i);
			}
		}
		else {
			deck.toArray(output);
		}
		return output;
	}
	
	public void discard(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			discardPile.add(cards[i]);
			hand.remove(cards[i]);
		}
	}
	
	public void trash(Card[] cards) {
		game.supply.trashCard(cards);
	}
	
	public void gain(Card card) {
		discardPile.add(card);
	}
	
	public void addAction(byte amount) {
		actions += amount;
	}
	
	public void addBuy(byte amount) {
		buys += amount;
	}
	
	public void addCoins(int amount) {
		coins += amount;
	}
	
	public Player(String name) {
		this.name = name;
	}
}