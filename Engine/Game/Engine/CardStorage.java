package Engine;
import java.util.ArrayList;
import java.util.List;

public class CardStorage {
	private static CardStorage instance = new CardStorage();
	private static List<Card> cards = new ArrayList<Card>();
	
	private CardStorage() {  };			
	
	public static CardStorage getInstance() {
		return instance;
	}
	
	public List<Card> getCards() {											//Removed Static
		return cards;
	}

	
	public void addCard(Card newCard) {										//Added AddCard
		cards.add(newCard);
	}
	
}
