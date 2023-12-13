public class URLConnection {
    public String makeURL(String search){
        search = search.toLowerCase();
        search = "https://pokemondb.net/pokedex/" + search;
        return search;
    }
}
