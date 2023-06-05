package testcases;

import pageObjects.eDOc_PO;
import general.mainCall;
import org.testng.annotations.Test;

public class eDocAutomation extends mainCall{
    @Test
    public static void newWaiver_eDoc(){
        eDOc_PO.login();
        eDOc_PO.createWaiver();
    }
}
