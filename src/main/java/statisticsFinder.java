import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class statisticsFinder extends URLConnection{
    public List<String> findStats(String URL) throws IOException {
        Document doc = Jsoup.connect(URL)
                .data("query","Java")
                .userAgent("Mozilla")
                .cookie("auth","token")
                .timeout(3000)
                .get();
        Elements elements = doc.getElementsByTag("td");
        List <String> info = new ArrayList<>();
        for (Element element : elements){
            info.add(String.valueOf(element));
        }
        return info;
    }
    public List<String> parseStats(List<String> info){
        List<String> embeddedStats= new ArrayList<>();
        for (int i=0; i<info.size();i++){
            String item = info.get(i);
            if (item.contains("cell-num")){
                embeddedStats.add(item);
            }
        }
        return embeddedStats;
    }
    public List<String> findFinalStats(List<String> embeddedStats){
        List<String> finalStats=new ArrayList<>();
        for (int i = 0; i<=15;i++){
            finalStats.add(embeddedStats.get(i));
            i=i+2;
        }
        return finalStats;
    }
}