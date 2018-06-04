import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class Parser {

    /*
     * @params
     */
    public static void main(String[] args) throws IOException {

//        String html ="<html><head><title>First parse</title></head>"
//                + "<body><p>Parsed HTML into a doc.</p></body></html>";


//        Document doc = Jsoup.parse(html);
//        Element element = doc.getElementsByTag("p");
//        Element element = doc.select("a").first();
//        String text = doc.body().text();
//        System.out.print(text);
//
//        Document doc = Jsoup.connect("https://biblioteket.stockholm.se/titel/415768").get();
//        String title = doc.title();
//        Element book = doc.select("#catalog-heading h1").first();
//        String nameOfTheBook = book.text();
//        System.out.print(nameOfTheBook);

        Document doc = Jsoup.connect("https://biblioteket.stockholm.se/titel/415768").get();
        Element bookIsAvailable = doc.selectFirst("tbody td strong");

        String isOnLibrary = bookIsAvailable.text();
        System.out.println(isOnLibrary);



    }
}
