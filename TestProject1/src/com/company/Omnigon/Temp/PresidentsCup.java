package com.company.Omnigon.Temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Omnigon on 9/2/2015.
 */
public class PresidentsCup {
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
        cssg.get("http://www.presidentscup.com/");
        cssg.manage().window().setSize(new Dimension(1212, 766));
        slp(10);

        WebElement element = cssg.findElement(By.cssSelector(".head-text"));
        Actions actions = new Actions(cssg);
        actions.moveToElement(element);
        actions.perform();
        slp(10);

        WebElement nextelement = cssg.findElement(By.cssSelector(".middle.active .ad-chart-beat"));
        Actions nextactions = new Actions(cssg);
        nextactions.moveToElement(nextelement);
        nextactions.perform();
        slp(10);

        //HEADER
        cssg.findElement(By.cssSelector(".navbar-inner"));
        cssg.findElement(By.cssSelector(".hidden-small.brand"));
        cssg.findElement(By.cssSelector(".nav-container li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".nav-container li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".nav-container li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".banner img[src='/content/dam/pgatour/logos/navigation/presidents-banner.png']"));
        cssg.findElement(By.cssSelector("a.citigroup"));
        cssg.findElement(By.cssSelector("a.rolex"));
        cssg.findElement(By.cssSelector(".user-menu.dropdown"));

        //AD1
        cssg.findElement(By.cssSelector(".js-ad.ad-pack.top .ad-chart-beat"));

        //PAGE HEADLIGHT SECTION
        cssg.findElement(By.cssSelector(".tournament-banner>.banner"));
        cssg.findElement(By.cssSelector(".clearfix>[href='http://www.presidentscup.com']"));
        cssg.findElement(By.cssSelector(".hidden-small .link-box"));
        cssg.findElement(By.cssSelector(".hidden-small .facebook"));
        cssg.findElement(By.cssSelector(".hidden-small .twitter"));
        cssg.findElement(By.cssSelector(".hidden-small .google-plus"));
        cssg.findElement(By.cssSelector(".hidden-small .pinterest"));
        cssg.findElement(By.cssSelector(".hidden-small .tumblr"));
        cssg.findElement(By.cssSelector(".hidden-small .mailto"));
        cssg.findElement(By.cssSelector(".dates"));
        cssg.findElement(By.cssSelector(".info-data [href='http://www.presidentscup.com']"));
        cssg.findElement(By.cssSelector("[href='http://www.presidentscup.com'] img"));

        //SUBBANER CLEARFIX
        cssg.findElement(By.cssSelector(".subbanner-content.clearfix"));
        cssg.findElement(By.cssSelector(".course-info"));
        cssg.findElement(By.cssSelector(".more.popup-radio"));
        cssg.findElement(By.cssSelector(".banner-weather"));
        cssg.findElement(By.cssSelector(".banner-weather .more"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(1)"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(1) img"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(1) .title"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(1) .category"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(2)"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(2) img"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(2) .title"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(2) .category"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(3)"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(3) img"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(3) .title"));
        cssg.findElement(By.cssSelector("ul.slider li:nth-child(3) .category"));
        cssg.findElement(By.cssSelector(".banner-ad.ad-container"));

        //TABS
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(6)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(7)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(8)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(9)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".wrapper .dropdown-menu"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".dropdown.pull-right li:nth-child(6)"));

        //COUNTDOWN SECTION
        cssg.findElement(By.cssSelector(".head-text"));
        cssg.findElement(By.cssSelector(".rolex-block"));
        cssg.findElement(By.cssSelector(".countdown.section"));
        cssg.findElement(By.cssSelector(".text.title.parbase p"));
        cssg.findElement(By.cssSelector(".tournament-countdown .countdown"));
        cssg.findElement(By.cssSelector(".countdown>div.countdown-section:nth-child(1)"));
        cssg.findElement(By.cssSelector(".countdown>div.countdown-section:nth-child(2)"));
        cssg.findElement(By.cssSelector(".countdown>div.countdown-section:nth-child(3)"));
        cssg.findElement(By.cssSelector(".countdown>div.countdown-section:nth-child(4)"));

        //US TEAM STANDINGS TABLE
        cssg.findElement(By.cssSelector(".team_1.team"));
        cssg.findElement(By.cssSelector(".team_1 .head"));
        cssg.findElement(By.cssSelector(".team_1 [href='/teams.html']"));
        cssg.findElement(By.cssSelector(".team_1 .team-leaders"));
        cssg.findElement(By.cssSelector(".team_1 .ryders-data-table"));
        cssg.findElement(By.cssSelector(".team_1 .footnote-qualifying"));
        cssg.findElement(By.cssSelector(".team_1 .link-more-about>a"));

        //INTERNATIONAL TEAM STANDINGS
        cssg.findElement(By.cssSelector(".team_2.team"));
        cssg.findElement(By.cssSelector(".team_2 .head"));
        cssg.findElement(By.cssSelector(".team_2 [href='/teams.html']"));
        cssg.findElement(By.cssSelector(".team_2 .team-leaders"));
        cssg.findElement(By.cssSelector(".team_2 .ryders-data-table"));
        cssg.findElement(By.cssSelector(".team_2 .footnote-qualifying"));
        cssg.findElement(By.cssSelector(".team_2 .link-more-about>a"));

        //CONNECT SECTION
        cssg.findElement(By.cssSelector(".connect.section"));
        cssg.findElement(By.cssSelector(".connect.section h2"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix .social.social-facebook"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix .social.social-twitter"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix .social.social-instagram"));
        cssg.findElement(By.cssSelector(".submodule.join-club.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.join-club.clearfix a"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix a"));

        //FEED SECTION
        cssg.findElement(By.cssSelector(".feed.section"));
        cssg.findElement(By.cssSelector(".tabbable-title"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style.clearfix li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style.clearfix li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style.clearfix li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(1)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(1) .thumb-info a"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(2)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(2) img"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(2) .thumb-info a"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(3)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(4)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(4) img"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(4) .thumb-info a"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(5)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(5) img"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(5) .thumb-info a"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(6)"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(6) img"));
        cssg.findElement(By.cssSelector(".grid .thumb:nth-child(6) .thumb-info a"));
        cssg.findElement(By.cssSelector(".response-btn-area.more .response-show-more"));

        //AD2
        cssg.findElement(By.cssSelector(".middle.active .ad-chart-beat"));

        //WEATHER HUB
        cssg.findElement(By.cssSelector(".weather.section"));
        cssg.findElement(By.cssSelector(".weather.section .module-header a"));
        cssg.findElement(By.cssSelector(".text-right"));
        cssg.findElement(By.cssSelector(".weather.section .temp"));
        cssg.findElement(By.cssSelector(".weather.section .cond"));
        cssg.findElement(By.cssSelector(".weather.section .wind"));
        cssg.findElement(By.cssSelector(".weather.section .humidity"));
        cssg.findElement(By.cssSelector(".weather.section .results-links a"));

        //FOOTER
        cssg.findElement(By.cssSelector(".footerNavigationPCUP"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(1) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(2) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(3) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(4) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(5) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(6) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(7) a"));
        cssg.findElement(By.cssSelector(".footer-list li:nth-child(8) a"));
        cssg.findElement(By.cssSelector(".footer-copyright p"));
        cssg.findElement(By.cssSelector(".social-logo-facebook"));
        cssg.findElement(By.cssSelector(".social-logo-twitter"));
        cssg.findElement(By.cssSelector(".social-logo-instagram"));
        cssg.quit();
    }
}
