package com.company.Omnigon.Temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Omnigon on 9/3/2015.
 */
public class PgatLeaderboard {
    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver cssg = new FirefoxDriver();
        cssg.get("http://www.pgatour.com/yahoo/leaderboard.html");
        cssg.manage().window().setSize(new Dimension(1212, 766));
        slp(10);

        WebElement element = cssg.findElement(By.xpath("//*[@id='lbnFirst10LeaderboardContainer']/div[10]/table/tbody/tr[1]/td[5]/div/a[1]"));
        Actions actions = new Actions(cssg);
        actions.moveToElement(element);
        actions.perform();
        slp(10);

        WebElement nextelement = cssg.findElement(By.cssSelector(".links-simple"));
        Actions nextactions = new Actions(cssg);
        nextactions.moveToElement(nextelement);
        nextactions.perform();
        slp(10);

        //HEADER
        cssg.findElement(By.cssSelector(".navbar-inner"));
        cssg.findElement(By.cssSelector(".navbar-inner .brand"));
        cssg.findElement(By.cssSelector(".brand-medium a:nth-child(2)"));
        cssg.findElement(By.cssSelector(".header-btn"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(6)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(7)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(8)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(9)"));
        cssg.findElement(By.cssSelector(".nav-container .dropdown li:nth-child(10)"));
        cssg.findElement(By.cssSelector(".other-tours"));
        cssg.findElement(By.cssSelector(".other-tours li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".other-tours li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".other-tours li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".other-tours li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".other-tours li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".login-button.log-in"));
        cssg.findElement(By.cssSelector(".nav-search"));
        cssg.findElement(By.cssSelector(".search-dropdown"));
        cssg.findElement(By.cssSelector("#topNavSearch"));
        cssg.findElement(By.cssSelector(".search-dropdown a"));

        //HEADLIGHT PAGE
        cssg.findElement(By.cssSelector(".tournament-banner.tournament-yahoo .banner"));
        cssg.findElement(By.cssSelector(".info>.name a"));
        cssg.findElement(By.cssSelector(".info-data"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .link-box"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .facebook"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .twitter"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .google-plus"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .pinterest"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .tumblr"));
        cssg.findElement(By.cssSelector(".hidden-small.sharing .mailto"));
        cssg.findElement(By.cssSelector(".tournament-banner.tournament-yahoo .logo"));

        //AD1
        cssg.findElement(By.cssSelector(".js-ad.ad-pack.topright.active"));

        //SUBBANER
        cssg.findElement(By.cssSelector(".subbanner"));
        cssg.findElement(By.cssSelector(".course-info"));
        cssg.findElement(By.cssSelector(".banner-weather"));
        cssg.findElement(By.cssSelector(".banner-weather a"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(1) .title"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(2) img"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(2) .title"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(3) img"));
        cssg.findElement(By.cssSelector(".broadcast-schedule li:nth-child(3) .title"));

        //LEADERBOARD
        cssg.findElement(By.cssSelector(".tournament-leaderboard-new.rounds-4.no-rolex"));
        cssg.findElement(By.cssSelector("#lbnLeaderboardHeaderContainer"));
        cssg.findElement(By.cssSelector(".small-tab-selector .customSelect"));
        cssg.findElement(By.cssSelector(".leaderboard-main"));
        cssg.findElement(By.cssSelector(".leaderboard-main-content>div>div.ad-new"));
        cssg.findElement(By.cssSelector(".ad-sticky"));
        cssg.findElement(By.cssSelector(".ad-sticky .ad-block.large"));
        cssg.findElement(By.cssSelector(".leaderboard-footer>.clearfix"));
        cssg.findElement(By.cssSelector(".parsys.bottomAd1"));
        cssg.findElement(By.cssSelector(".parsys.bottomAd2"));

        //DONT MISS THIS SECTION
        cssg.findElement(By.cssSelector(".container>.dontMissThisIParsys"));
        cssg.findElement(By.cssSelector(".container>.dontMissThisIParsys p"));
        cssg.findElement(By.cssSelector(".dontMissThisIParsys .item:nth-child(1) a"));
        cssg.findElement(By.cssSelector(".dontMissThisIParsys .item:nth-child(2) a"));
        cssg.findElement(By.cssSelector(".dontMissThisIParsys .item:nth-child(3) a"));
        cssg.findElement(By.cssSelector(".dontMissThisIParsys .item:nth-child(4) a"));

        //LINKS SIMPLE
        cssg.findElement(By.cssSelector(".links-simple"));
        cssg.findElement(By.cssSelector(".links-simple .item:nth-child(1)"));
        cssg.findElement(By.cssSelector(".links-simple .item:nth-child(2)"));
        cssg.findElement(By.cssSelector(".links-simple .item:nth-child(3)"));
        cssg.findElement(By.cssSelector(".links-simple .item:nth-child(4)"));
        cssg.findElement(By.cssSelector(".links-simple .item:nth-child(5)"));

        //FOOTER
        cssg.findElement(By.cssSelector(".footer-list ul"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(6)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(7)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(9)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(11)"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(12)"));
        cssg.findElement(By.cssSelector(".footer-copyright"));
        cssg.findElement(By.cssSelector(".footerlConnectWith"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-facebook"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-twitter"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-googleplus"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-foursquare"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-instagram"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-pinterest"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-youtube"));
        cssg.findElement(By.cssSelector(".social-logo.social-logo-mobile"));
        
        cssg.quit();
    }
}
