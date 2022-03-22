package activities.WhenDo;

import controles.TextBox;
import controles.Button;
import org.openqa.selenium.By;


public class EditScreen {
    public TextBox editTxtBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public Button deleteBtn = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));

}
