public class ScoringEngine {
    private final GameMode mode;

    public ScoringEngine(GameMode mode) {
        this.mode = mode;
    }

    public ScoreResult scoreRound(Player player) {
        return new ScoreResult(
            mode.scoreThrowCatch(player.getThrow(), player.getCatch()),
            mode.scoreCollections(player.getDrafted()),
            mode.scoreAnimals(player.getDrafted()),
            mode.scoreActivities(player.getDrafted(), player.getUsedActivities()),
            mode.scoreRegions(player.getDrafted(), player.getVisited())
        );
    }
}
