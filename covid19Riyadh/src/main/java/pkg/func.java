package pkg;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class func {

    void Today_date() throws ParseException {
        Date today = new Date();
        Date dateStr = today;

        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        DateFormat formatter1 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("تاريخ اليوم : "+formatter1.format(formatter.parse(String.valueOf(dateStr))));

    }
    void Gernaral() throws IOException {
        System.out.println("=================عام================");

        String url = "https://www.worldometers.info/coronavirus/country/saudi-arabia/";

        Document document = Jsoup.connect(url).get();

        Elements total = document.getElementsByClass("maincounter-number");
        Elements now  = document.getElementsByClass("news_li");
//       String title = document.title();
//       title = title.substring(0, 24);
//       System.out.println("Web sources: "+title);
        String urlname = url;
        urlname = urlname.substring(9,29);
        // System.out.println("URL : "+urlname);


        System.out.println("العدد الكلي : "+total.get(0).text());
        System.out.println("الوفيات : "+total.get(1).text());
        System.out.println("المعافين : "+total.get(2).text());
        String[] nowP = now.text().split(" ");
        System.out.println("الحالات الجديدة :"+nowP[0]);
        System.out.println("الوفيات :"+nowP[4]);

        // Elements perc = document.getElementsByClass("number-table");
        System.out.println("" +
                "================الرياض=================");
        String url2 = "https://sehhty.com/sa-covid/";
        Document document2 = Jsoup.connect(url2).get();
//        String title2 = document2.title();
//       System.out.println("Web sources: "+title2);


        Elements city_name = document2.getElementsByClass("citycard");


        String [] citys = {"المدينة" , "العدد الكلي" , "الحالات النشطة" , "التشافي" , "الوفيات"};
        String[] parts = city_name.text().split(" ");
        for(int i=0;i<5;i++) {
            System.out.println(citys[i] + "    :   " + parts[i]);
        }

        String [] data = {
                "العدد الكلي : "+total.get(0).text() ,
                "الوفيات : "+total.get(1).text(),
                "المعافين : "+total.get(2).text(),
                "الحالات الجديدة :"+nowP[0],
                "الوفيات :"+nowP[4]
        };

        ImageIcon IC = new ImageIcon(getClass().getResource("/logo.png"));
        JOptionPane.showMessageDialog(null,"المملكة العربية السعودية"+"\n ------------ \n"+
                data[0] + "\n" +  data[1] + "\n" + data[2]+"\n" + data[3] +"\n"+data[4]+
                "\n \n " + citys[0] + " : "+parts[0]
                + "\n ------------ \n"+
                citys[1] + " : "+parts[1] + "\n"+
                citys[2] + " : "+parts[2] + "\n"+
                citys[3] + " : "+parts[3] + "\n"+
                citys[4] + " : "+parts[4] + "\n \n \n \n "


                , "حالات كورونا اليوم", +
                        JOptionPane.INFORMATION_MESSAGE,   IC);


        

    }




    void logo() throws FileNotFoundException {
//        File myObj = new File("/Users/Faisal/Documents/covid19/src/main/resources/covid19.txt");
//        Scanner myReader = new Scanner(myObj);
//        while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            System.out.println(data);


        System.out.println("\n" +
                " ██████  ██████  ██    ██ ██ ██████       \uD83E\uDDA0  \uD83E\uDDA0\uD83E\uDDA0\uD83E\uDDA0  \n" +
                "██      ██    ██ ██    ██ ██ ██   ██    \uD83E\uDDA0\uD83E\uDDA0 \uD83E\uDDA0   \uD83E\uDDA0 \n" +
                "██      ██    ██ ██    ██ ██ ██   ██      \uD83E\uDDA0  \uD83E\uDDA0\uD83E\uDDA0\uD83E\uDDA0 \n" +
                "██      ██    ██  ██  ██  ██ ██   ██      \uD83E\uDDA0      \uD83E\uDDA0 \n" +
                " ██████  ██████    ████   ██ ██████       \uD83E\uDDA0  \uD83E\uDDA0\uD83E\uDDA0\uD83E\uDDA0  \n" +
                "\n");

    }
    void prepare() throws IOException, InterruptedException {

        String cmd = "clear";
        Runtime run = Runtime.getRuntime();
        Process pr = run.exec(cmd);
        pr.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line = "";
        while ((line=buf.readLine())!=null) {
            System.out.println(line);
        }
    }


}
