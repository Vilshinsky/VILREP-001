package com.company.Omnigon.Temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Omnigon on 9/2/2015.
 */
public class WorldGolfChampionship {
    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver cssg = new ChromeDriver();
        cssg.get("http://www.worldgolfchampionships.com/dell-match-play.html");
        cssg.manage().window().setSize(new Dimension(1200, 675));
        slp(10);

        WebElement element = cssg.findElement(By.cssSelector(".nav.nav-tabs.slim"));
        Actions actions = new Actions(cssg);
        actions.moveToElement(element);
        actions.perform();
        slp(10);

        WebElement nextelement = cssg.findElement(By.cssSelector(".response-btn-area.more .response-btn"));
        Actions nextactions = new Actions(cssg);
        nextactions.moveToElement(nextelement);
        nextactions.perform();
        slp(10);

        //HEADER
        cssg.findElement(By.cssSelector(".wgcTopNavigation.section"));
        cssg.findElement(By.cssSelector(".hidden-small.brand"));
        cssg.findElement(By.cssSelector(".header-btn"));
        cssg.findElement(By.cssSelector(".championship"));
        cssg.findElement(By.cssSelector("td.championship>a"));
        cssg.findElement(By.cssSelector("td:nth-child(2)"));
        cssg.findElement(By.cssSelector("td:nth-child(2)>a"));
        cssg.findElement(By.cssSelector("td:nth-child(3)"));
        cssg.findElement(By.cssSelector("td:nth-child(3)>a"));
        cssg.findElement(By.cssSelector("td:nth-child(4)"));
        cssg.findElement(By.cssSelector("td:nth-child(4)>a"));
        cssg.findElement(By.cssSelector("td:nth-child(5)"));
        cssg.findElement(By.cssSelector("td:nth-child(5)>a"));
        cssg.findElement(By.cssSelector("td:nth-child(6)"));
        cssg.findElement(By.cssSelector("td:nth-child(6) .login-button"));

        //PAGE HEADLIGHT BLOCK
        cssg.findElement(By.cssSelector(".clearfix>.info"));
        cssg.findElement(By.cssSelector("h1.name>a"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .link-box"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .facebook"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .twitter"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .google-plus"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .pinterest"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .tumblr"));
        cssg.findElement(By.cssSelector("b.hidden-small.sharing.popover-visible .mailto"));
        cssg.findElement(By.cssSelector(".clearfix>a>.logo"));
        cssg.findElement(By.cssSelector(".dates"));
        cssg.findElement(By.cssSelector(".purse"));
        cssg.findElement(By.cssSelector(".hidden-small.winning-share"));
        cssg.findElement(By.cssSelector(".hidden-small.fec-points"));

        //HEADER CLEARFIX
        cssg.findElement(By.cssSelector(".header.clearfix"));
        cssg.findElement(By.cssSelector(".course-info"));
        cssg.findElement(By.cssSelector("span.title.hidden-small"));
        cssg.findElement(By.cssSelector(".course-info>span:nth-child(3)"));
        cssg.findElement(By.cssSelector(".clouds"));
        cssg.findElement(By.cssSelector(".banner-weather>strong"));
        cssg.findElement(By.cssSelector(".banner-weather>.hidden-small.hidden-medium"));
        cssg.findElement(By.cssSelector(".banner-weather>.more"));

        //CONTENT BLOCK
        cssg.findElement(By.cssSelector("div.content"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(1) .category"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(1) .title"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(2) img"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(2) .category"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(2) .title"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(3) img"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(3) .category"));
        cssg.findElement(By.cssSelector(".slider>li:nth-child(3) .title"));
        cssg.findElement(By.cssSelector(".banner-ad.ad-container"));

        //TOURNAMENT OVERVIEW SUB ICONS
        cssg.findElement(By.cssSelector(".tournament-overview-sub-icons"));
        cssg.findElement(By.cssSelector(".breakpoints>li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".link-volunteer"));
        cssg.findElement(By.cssSelector(".breakpoints>li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".link-parking"));
        cssg.findElement(By.cssSelector(".breakpoints>li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".link-charity"));
        cssg.findElement(By.cssSelector(".breakpoints>li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".link-sponsors"));
        cssg.findElement(By.cssSelector(".breakpoints>li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".link-tickets"));

        //ADVERTISEMENT
        cssg.findElement(By.cssSelector(".adContainer.section .ad-new"));

        //TABS
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(4)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(5)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(6)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim>li:nth-child(7)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown.pull-right.tabdrop"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown-menu"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown-menu>li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown-menu>li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown-menu>li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".nav.nav-tabs.slim .dropdown-menu>li:nth-child(4)"));

        //SPONSOR SPOTLIGHT SECTION
        cssg.findElement(By.cssSelector(".col-left"));
        cssg.findElement(By.cssSelector(".col-left .module-header"));
        cssg.findElement(By.cssSelector(".col-left .sponsor-banner-box"));
        cssg.findElement(By.cssSelector(".results-links a"));

        //CONNECT SECTION
        cssg.findElement(By.cssSelector(".tournament-connect>.clearfix:nth-child(1)"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.follow-us.clearfix>.title"));
        cssg.findElement(By.cssSelector(".social.social-facebook"));
        cssg.findElement(By.cssSelector(".social.social-twitter"));
        cssg.findElement(By.cssSelector(".social.social-instagram"));
        cssg.findElement(By.cssSelector(".submodule.join-club.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.join-club.clearfix>.title"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix .clearfix"));
        cssg.findElement(By.cssSelector(".submodule.join-club.clearfix a"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix>.title"));
        cssg.findElement(By.cssSelector(".e-contact"));
        cssg.findElement(By.cssSelector(".submodule.contact-us.clearfix a"));

        //FEED TOURNAMENT
        cssg.findElement(By.cssSelector(".tabbable-head.button-style"));
        cssg.findElement(By.cssSelector(".tabbable-title"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style li:nth-child(1)"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style li:nth-child(2)"));
        cssg.findElement(By.cssSelector(".tabbable-head.button-style li:nth-child(3)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(1)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(2)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(3)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(4)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(5)"));
        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(6)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(7)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(8)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(9)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(10)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(11)"));
//        cssg.findElement(By.cssSelector(".feed-content div.thumb:nth-child(12)"));
        cssg.findElement(By.cssSelector(".response-btn-area.more .response-btn"));

        //FOOTER NAVIGATION
        cssg.findElement(By.cssSelector(".footer-nav"));
        cssg.findElement(By.cssSelector(".footer-nav>a:nth-child(1)"));
        cssg.findElement(By.cssSelector(".footer-nav>a:nth-child(2)"));
        cssg.findElement(By.cssSelector(".footer-nav>a:nth-child(3)"));
        cssg.findElement(By.cssSelector(".footer-nav>a:nth-child(4)"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='/overview.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='/internationalfederation.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='/sponsors.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='/charity.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='http://www.pgatour.com/company/tos.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='http://www.pgatour.com/company/privacy-policy.html']"));
        cssg.findElement(By.cssSelector(".footer-nav a[href='http://www.pgatour.com/advertise.html']"));
        cssg.findElement(By.cssSelector("#teconsent a"));
        cssg.findElement(By.cssSelector(".footer-logos"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".footer-logos>a:nth-child(1) img"));
        cssg.findElement(By.cssSelector(".wgc-footer p"));

        //SOCIAL FOOTER
        cssg.findElement(By.cssSelector(".copy-text-connect"));
        cssg.findElement(By.cssSelector(".social-logo-facebook"));
        cssg.findElement(By.cssSelector(".social-logo-twitter"));
        cssg.findElement(By.cssSelector(".social-logo-instagram"));

        cssg.quit();
    }
}
