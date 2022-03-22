package testClean;

import activities.WhenDo.ConfirmModal;
import activities.WhenDo.CreateTaskScreen;
import activities.WhenDo.EditScreen;
import activities.WhenDo.ListScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    CreateTaskScreen createTaskScreen = new CreateTaskScreen();
    ListScreen listScreen = new ListScreen();
    EditScreen editScreen = new EditScreen();
    ConfirmModal confirmModal = new ConfirmModal();
    String Txt = "Paola Clean";

    @Test
    public void createTaskTest() throws MalformedURLException, InterruptedException {
        //create project
        listScreen.addButton.click();
        createTaskScreen.titleTxtbBox.setValue(Txt);
        createTaskScreen.saveButton.click();


        Thread.sleep(2000);
        String expectResult=Txt;
        String actualResult=listScreen.firstTaskLabel.getText();

        Assertions.assertEquals(expectResult,actualResult,"ERROR");

        //delete project
        listScreen.firstTaskLabel.click();
        Thread.sleep(2000);
        editScreen.deleteBtn.click();
        confirmModal.confirmDeleteBtn.click();

        if(listScreen.firstTaskLabel.isControlDisplayed()){
            Assertions.assertNotEquals(expectResult, actualResult,"ERROR");
        }
        else{
           String expectResult2 = "No tasks added";
           String actualResult2 = listScreen.noTaskLabel.getText();
           Assertions.assertEquals( expectResult2, actualResult2, "Error");
        }
    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
