package navfort.pages;

import navfort.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class QuicklaunchpadPage extends BasePage{

    public QuicklaunchpadPage() {

        PageFactory.initElements(Driver.get(),this);
    }


}
