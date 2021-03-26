package GuessThatCurrency.Controllers;

import GuessThatCurrency.Main;
import javafx.scene.input.MouseEvent;

public class MenuController {

    public void play_Clicked(MouseEvent mouseEvent) {
        Main.SCENE_MANAGER.setCurrentScene(1);
    }
}
