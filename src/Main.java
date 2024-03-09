

import crawler.CrawlerView;
import user.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("===Main Menu===\n" +
                    "0 - Exit\n" +
                    "1 - User\n" +
                    "2 - Crawler\n" +
                    "============");
            switch (sc.next()){
                case "0" :
                    System.out.println("Thank you.");return;
                case "1" :
                    UserView.main(sc);break;
                case "2" :
                    CrawlerView.main();break;
            }
        }

    }
}