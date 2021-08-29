package chapterFifteen;

import java.awt.image.ImagingOpException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        System.out.println("A web crawler");
        //enter the starting url
        System.out.println("Enter the starting url: ");
        Scanner scanner = new Scanner(System.in);
        String urlString = scanner.next();
        //add starting url to a list of pending urls to traverse
        List<String> listOfPendingUrls = new ArrayList<>();
        List<String> listOfTraversedUrls = new ArrayList<>();
        //add the starting url to the list of traversed urls
        listOfPendingUrls.add(urlString);
        while(listOfTraversedUrls.size() < 100 && listOfPendingUrls.size() != 0){
            String urlToTraverse = listOfPendingUrls.remove(0);
            listOfTraversedUrls.add(urlToTraverse);
            try{
               URL url = new URL(urlToTraverse);
               Scanner urlScanner = new Scanner(url.openStream());
               while (urlScanner.hasNext()){
                   String line = urlScanner.nextLine();
                   int start = line.indexOf("http:");
                   while (start > 0){
                       int end = line.indexOf("\"", start);
                       if (end > 0){
                           String foundUrlString = line.substring(start, end);
                           if (!listOfTraversedUrls.contains(foundUrlString)){
                               listOfPendingUrls.add(foundUrlString);
                           }
                       }
                       start = line.indexOf("http:", end + 1);
                   }
               }
           }
           catch (MalformedURLException ex){
               System.out.println("Invalid url");
           }
           catch (IOException ex){
               ex.printStackTrace();
           }

        }

        //traverse the contents of the url and look for other urls
        //add found urls to the list of pending urls to traverse
        // repeat the loop while the list of traversed urls is less than 100
    }
}
