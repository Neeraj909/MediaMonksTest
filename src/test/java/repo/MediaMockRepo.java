package repo;

import base.UIBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaMockRepo extends UIBase {

    public WebElement enterUser(){
        return getDriver().findElement(By.cssSelector("div.form-group input[name='email']"));
    }
    public WebElement enterPass(){
        return getDriver().findElement(By.cssSelector("div.form-group input[name='password']"));
    }
    public WebElement loginButton(){
        return getDriver().findElement(By.cssSelector("button[class*='btn-block effect ladda-button waves-effect']"));
    }
    public WebElement getProfileTitle(){
        return getDriver().findElement(By.cssSelector(".dashboard-bread div.section-heading h2"));
    }
}
