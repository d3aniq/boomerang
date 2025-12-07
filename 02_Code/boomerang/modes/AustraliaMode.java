public class AustraliaMode implements GameMode {
    @Override
    public List<Card> createDeck() {
        return DeckFactory.createAustraliaDeck();
    }

    @Override
    public int scoreThrowCatch(Card t, Card c) {
        return Math.abs(t.getNumber() - c.getNumber());
    }

    // Other scoring methods…
}
