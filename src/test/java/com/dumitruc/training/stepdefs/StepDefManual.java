package com.dumitruc.training.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

/**
 * Created by dumitruc on 12/12/2014.
 */
public class StepDefManual extends StepDefBase{

    private static final Logger LOGGER = LoggerFactory.getLogger(StepDefManual.class);


    @And("^I manually (.*) on (.*) and it (?:|is still )(passes|fails|pending)$")
    public void I_manually_do_something_on_some_date_and_it_passes(String action, String when, String status) throws Throwable {
        LOGGER.info(String.format("I have \"%s\" on \"%s\" and the status is: %s",action,when,status));
        if(status.equals("pending")){
            throw new PendingException("This manual test step has not yet been executed");
        }else{
            assertThat("Test fails during manual execution",status,is("passes"));
        }
    }


}
