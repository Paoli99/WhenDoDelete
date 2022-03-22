package activities.WhenDo;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;


public class ListScreen {
    public Label firstTaskLabel = new Label(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label noTaskLabel = new Label(By.id("com.vrproductiveapps.whendo:id/noNotesText"));
}
