package pageObjects;
import config.configProperties;
import general.mainCall;
import general.reusebleFunctions;
import payload.eWaiverPro;

import static general.reusebleFunctions.modalContainerAction;

public class eDOc_PO extends mainCall {
    /*
    ----------------------------------------------------------------------------------------------

        Selectors(By name,By css, By x-path) for creating a new eDoc in eWaiverPro...

    ----------------------------------------------------------------------------------------------
    */


    public static String clickEmailField="email";
    public static String clickPassField="password";
    public static String clickSubmitButton="//button[@type='submit']";
    public static String clickWaivers_Docs="//a[@href='https://staging.ewaiverpro.app/edoc-admin']";
    public static String clickPlusButton="//img[@class='wp-image-3073 aligncenter size-thumbnail']";
    public static String enterEdocName="//*[@id='title']";
    public static String header="//h5[@class='modal-title']";
    public static String hitSaveWaiver="//*[@id='SaveAddWaiver']";

    /*
    ----------------------------------------------------------------------------------------------

        Functions for creating a new eDoc in eWaiverPro...

    ----------------------------------------------------------------------------------------------
    */


    public static void login(){
        reusebleFunctions.navigateURL("https://staging.ewaiverpro.app/login");
        reusebleFunctions.inputTextByElementName(clickEmailField, configProperties.userName);
        reusebleFunctions.inputTextByElementName(clickPassField, configProperties.pass);
        reusebleFunctions.clickElementByxpath(clickSubmitButton);
    }

    public static void createWaiver(){
        reusebleFunctions.clickElementByxpath(clickWaivers_Docs);
        reusebleFunctions.clickElementByxpath(clickPlusButton);
        reusebleFunctions.modalContainerAction(enterEdocName,"waiverTesting776",hitSaveWaiver);
    }
}
