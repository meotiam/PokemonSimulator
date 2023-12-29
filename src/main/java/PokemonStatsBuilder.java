import java.io.IOException;
import java.util.List;

public class PokemonStatsBuilder extends statisticsFinder {
    public Pokemon StatsBuilder (String URL) throws IOException {
        List<String> stats = findStatisticsFinal(URL);
        String HP = stats.get(0);
        String attack = stats.get(0);
        String defense = stats.get(0);
        String spAttack = stats.get(0);
        String spDefense = stats.get(0);
        Pokemon pokemon = new pokemon( HP, attack, defense, spAttack, spDefense, speed);
        return pokemon;
    }

}
