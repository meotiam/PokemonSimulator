import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FinderTest extends statisticsFinder {
    @Test
    public void parserTest() throws IOException {
        List<String> test = new ArrayList<>();
        test = findStats("https://pokemondb.net/pokedex/raichu");
        System.out.print(test);
    }
    @Test
    public void embeddedStatsTest() throws IOException {
        List<String> test  = findStats("https://pokemondb.net/pokedex/raichu");
        List <String> testTwo = parseStats(test);
        System.out.print(testTwo);
    }
    @Test
    public void finalStatsTest() throws IOException {
        List<String> test  = findStats("https://pokemondb.net/pokedex/raichu");
        List <String> testTwo = parseStats(test);
        System.out.print(findFinalStats(testTwo));
    }
}
