package com.dumitruc.training.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by dumitruc on 12/12/2014.
 */
public class StepDefCheckout extends StepDefBase{

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefCheckout.class);



    @Given("^the price of a \"([^\"]*)\" is (.*)$")
    public void thePriceOfIs(String arg1, int arg2) throws Throwable {
        LOGGER.info("The price of %s is %s",arg1,arg2);
    }


}
