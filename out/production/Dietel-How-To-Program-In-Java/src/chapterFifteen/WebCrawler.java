package chapterFifteen;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class WebCrawler{
    public static void main(String... args) {
        System.out.println("Enter a starting web url: ");
        Scanner scanner = new Scanner(System.in);
        String urlString = scanner.next();
        crawl(urlString);
    }

    private static void crawl(String urlString) {
        List<String> listOfPendingUrls = new ArrayList<>();
        List<String> listOfVisitedUrls = new ArrayList<>();
        listOfPendingUrls.add(urlString);
        while (!listOfPendingUrls.isEmpty() && listOfVisitedUrls.size() <= 100){
            String urlToVisit = listOfPendingUrls.remove(0);
            if(!listOfVisitedUrls.contains(urlToVisit)){
                listOfVisitedUrls.add(urlString);
                System.out.println("Crawl - "+ urlString);
            }
            for (String subUrl: getSubUrls(urlToVisit)) {
                if (listOfVisitedUrls.contains(subUrl)){
                    listOfPendingUrls.add(subUrl);
                }
            }
        }
    }

    private static List<String> getSubUrls(String urlToVisit) {
        List<String> listOfSubUrls = new ArrayList<>();
        try(Formatter formatter = new Formatter("/home/ehizman/semicolon/cristiano_wiki.html")){
           URL url = new URL(urlToVisit);
           Scanner scanner = new Scanner(url.openStream());
           int start = 0;
           while (scanner.hasNext()){
               String line = scanner.nextLine();
               formatter.format("%s\n",  line);
               start = line.indexOf("https:", start);
               while (start > 0){
                   int end = line.indexOf("/", start);
                   if(end > 0){
                       listOfSubUrls.add(line.substring(start, end + 1));
                       start = line.indexOf("https:", end + 1);
                   }
               }
           }


        }catch (IOException ex){
           ex.printStackTrace();
        }
        return listOfSubUrls;
    }
}