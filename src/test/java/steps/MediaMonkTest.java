package steps;
import action.MediaMonkAction;
import base.UIBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.CommonUtills;

public class MediaMonkTest extends  UIBase{
   MediaMonkAction mediaMonkAction=new MediaMonkAction();
    @Given("^I launch to hotel site \"([^\"]*)\" env$")
    public void iLoginToHotelSiteEnv(String env) throws Throwable {
        CommonUtills.setEnv(env);
        UIBase.browserInitialization();
    }
    @Then("^I login to site$")
    public void iLoginToSite() {
        mediaMonkAction.loginToSite();
    }
    @Then("^Verify element text \"([^\"]*)\"$")
    public void verifyElementText(String text) throws Throwable {
        mediaMonkAction.verifyText(text);
    }
}
