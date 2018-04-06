package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() {

		return cardsInDeck.remove(0);

	}
	/*
	public ArrayList<Card> getDeck()
	{
		return deckCards;
	}
	public int countRank(eRank eRank)
	{
		return deckCards.stream().filter(c -> c.geteRank() = eRank).collect(Collectors.toList()).size();
	}
*/
}
