import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class statisticsFinderTest extends statisticsFinder {
    @Test
    public void parserTest() throws IOException {
        List<String> test = new ArrayList<>();
        test = findStats("https://pokemondb.net/pokedex/raichu");
        System.out.print(test);
    }
    @Test
    public void embeddedStatsTest() throws IOException{
        List<String> test = new ArrayList<>();
        test = findStats("https://pokemondb.net/pokedex/raichu");
        System.out.print(parseStats(test));
    }
}
