import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class URLConnectionTest extends URLConnection {
    @Test
    public void makeURLTest(){
        String test = makeURL("Pikachu");
        Assertions.assertEquals("https://pokemondb.net/pokedex/pikachu", test);
        String testTwo = makeURL("PIKACHU");
        Assertions.assertEquals("https://pokemondb.net/pokedex/pikachu", testTwo);
    }
}
