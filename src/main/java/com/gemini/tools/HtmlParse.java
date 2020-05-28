package com.gemini.tools;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;

/**
 * todo (用一句话描述该文件做什么)
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/5/23 8:45
 */
public class HtmlParse {

    public static void main(String[] args) throws IOException, InterruptedException {
        // String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=码出高效&pvid=2063bdc8bee348fc920b512f84b27375&language=cn#jd.com";
        String url = "http://www.tiejiang.org/tag/management/page/1";
        Document document = Jsoup.parse(new URL(url), 5000);
        // Element element = document.getElementById("J_goodsList");
        // Elements elements = element.getElementsByTag("li");
        //
        // for (Element e : elements) {
        //     String img = e.getElementsByTag("img").eq(0).attr("src");
        //     if (img == null || "".equals(img)) {
        //         img = e.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
        //     }
        //     String price = e.getElementsByClass("p-price").eq(0).text();
        //     String name = e.getElementsByClass("p-name").eq(0).text();
        //     System.out.println(img);
        //     System.out.println(price);
        //     System.out.println(name);
        //     System.out.println("================================================================================================================================================");
        // }
        /*Elements element0 = document.getElementsByClass("audio-info");
        if (element0 == null || element0.size() < 1) {
            Element element = document.getElementById("breadcrumbs");
            element0 = element.getElementsByTag("h1");
            String text = element0.get(0).text();
            String result = "<div class=\"audio-info\"> \n" +
                    " <h3>" + text + "</h3> \n" +
                    "</div>";
            System.out.println(result);
        } else {
            System.out.println(element0);
        }
        Element element = document.getElementById("article-content");
        System.out.println(element);*/
        // Elements elements = element.getElementsByTag("li");
        //
        // for (Element e : elements) {
        //     String img = e.getElementsByTag("img").eq(0).attr("src");
        //     if (img == null || "".equals(img)) {
        //         img = e.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
        //     }
        //     String price = e.getElementsByClass("p-price").eq(0).text();
        //     String name = e.getElementsByClass("p-name").eq(0).text();
        //     System.out.println(img);
        //     System.out.println(price);
        //     System.out.println(name);
        //     System.out.println("================================================================================================================================================");
        // }


        Elements elements = document.getElementsByClass("bloglist-container clr");
        //  System.out.println(elements);
        if (elements != null && elements.size() > 0) {
            int size = elements.size();
            // String href = elements.get(i).getElementsByTag("article").eq(0).attr("href");

            for (int i = 0; i < size; i++) {
                Elements articles = elements.get(i).getElementsByClass("home-blog-entry col span_1 clr");
                int index = articles.size() - 1;
                for (int j = index; j > -1; j--) {
                    String attrHref = articles.get(j).getElementsByTag("a").eq(0).attr("href");
                    // System.out.println(attrHref);
                    Document documentTemp = Jsoup.parse(new URL(attrHref), 5000);
                    doParseDoc(documentTemp);
                    System.out.println("---");
                    Thread.sleep(2000);
                }

                // for (Element art : articles) {
                //     String attrHref = art.getElementsByTag("a").eq(0).attr("href");
                //     System.out.println(attrHref);
                // }
            }
        }


        doParseDoc(document);

    }

    private static void doParseDoc(Document document) {
        Elements element0 = document.getElementsByClass("audio-info");
        if (element0 == null || element0.size() < 1) {
            Element element = document.getElementById("breadcrumbs");
            element0 = element.getElementsByTag("h1");
            String text = element0.get(0).text();
            String result = "<div class=\"audio-info\"> \n" +
                    " <h3>" + text + "</h3> \n" +
                    "</div>";
            System.out.println(result);
        } else {
            System.out.println(element0);
        }
        Element element = document.getElementById("article-content");
        if (element == null) {
            Elements i1ytqT9_0 = document.getElementsByClass("single-text");
            if (i1ytqT9_0 == null) {
                i1ytqT9_0 = document.getElementsByClass("_2i1ytqT9_0");
            }
            System.out.println(i1ytqT9_0);
        } else {
            System.out.println(element);
        }
    }
}
