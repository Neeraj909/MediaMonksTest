package action;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import repo.MediaMockRepo;
import utils.CommonUtills;
public class MediaMonkAction extends  MediaMockRepo{

         public void loginToSite(){
             enterUser().sendKeys(CommonUtills.getEnv().getConfig().getEnvironment().getUserName());
             enterPass().sendKeys(CommonUtills.getEnv().getConfig().getEnvironment().getPassword());
             loginButton().click();
         }
         public void verifyText(String text){
             getWebDriverWait().until(ExpectedConditions.visibilityOf(getProfileTitle()));
             System.out.println(getProfileTitle().getText());
             Assert.assertEquals(getProfileTitle().getText(),text);
         }


    }
