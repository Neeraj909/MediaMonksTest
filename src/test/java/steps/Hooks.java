package steps;

import base.UIBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Hooks extends UIBase {

    @After(order = 1)
    public void takeScreenShot(Scenario scenario){
        if(scenario.isFailed()){
            File imageFile = ((TakesScreenshot) UIBase.getDriver()).getScreenshotAs(OutputType.FILE);
            String failureImageFileName = scenario.getName()
                    + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
            byte[] data = ((TakesScreenshot) UIBase.getDriver()).getScreenshotAs(OutputType.BYTES);
            File failureImageFile = new File("./screenshot/" + failureImageFileName);
            try {
                FileUtils.copyFile(imageFile, failureImageFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            scenario.embed(data,"image/png");
        }
    }

    @After(order = 0)
        public void closeDriver(){
        getDriver().close();
    }
}
