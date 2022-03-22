package activities.calculator;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button twoButton = new Button(By.xpath("//android.widget.Button[@text='2']"));
    public Button plusButton = new Button(By.xpath("//android.widget.Button[@content-desc='plus']"));
    public Button fiveButton = new Button(By.xpath("//android.widget.Button[@text='5']"));
    public Button equalsButton = new Button(By.xpath("//android.widget.Button[@content-desc='equals']"));
    public Label resultLabel = new Label(By.id("com.google.android.calculator:id/result_final"));
}