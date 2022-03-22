package activities.WhenDo;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class CreateTaskScreen {

    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public TextBox titleTxtbBox = new TextBox(By.xpath("//android.widget.EditText[contains(@text, 'Title')]"));
    public Button saveButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));

}
