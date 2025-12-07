public interface GameMode {
    List<Card> createDeck();
    int scoreThrowCatch(Card throwCard, Card catchCard);
    int scoreCollections(List<Card> cards);
    int scoreAnimals(List<Card> cards);
    int scoreActivities(List<Card> cards, Set<String> usedActivities);
    int scoreRegions(List<Card> playedCards, Set<String> visitedSites);
}
