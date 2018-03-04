package support;

import hooks.ServerHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.java.After;
import cucumber.api.Scenario;


import nicebank.Account;
import nicebank.Teller;

class AtmUserInterface implements Teller {


    private final EventFiringWebDriver webDriver;


    public AtmUserInterface(){

        System.setProperty("webdriver.gecko.driver", "geckodriver");

        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());



    }


    public void withdrawFrom(Account account, int dollars) {

        try {

            webDriver.get("http://localhost:" + ServerHooks.PORT);

            webDriver.findElement(By.id("Amount"))

                    .sendKeys(String.valueOf(dollars));

            webDriver.findElement(By.id("Withdraw")).click();

        }

        finally {

            webDriver.close();

        }

    }
}