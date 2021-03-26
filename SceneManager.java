package GuessThatCurrency;

import GuessThatCurrency.Controllers.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class SceneManager {
    private ArrayList<Scene> scenes = new ArrayList<>();

    SceneManager() {
        setDefaultScenes();
    }

    /*
    0 = Main Menu
    1 = Game
    2 = Dead
    3 = Pause Menu
    4 =
     */

    public void setCurrentScene(int idx) {
        if (idx == 0) {
            Main.main_Stage.hide();
            Main.main_Stage.setScene(scenes.get(idx));
            Main.main_Stage.setTitle("Guess That Currency");
            Main.main_Stage.setResizable(false);
            Main.main_Stage.show();
        } else if (idx == 1) {

            Main.main_Stage.hide();
            Main.main_Stage.setScene(scenes.get(idx));
            Main.main_Stage.setTitle("Guess That Currency");
            Main.main_Stage.setResizable(false);
            Main.main_Stage.show();

        } else if (idx == 2) {

            Stage stage = new Stage();
            stage.setScene(scenes.get(idx));
            stage.setTitle("Guess That Currency - YOU LOST");
            stage.initOwner(Main.main_Stage);
            stage.initStyle(StageStyle.UNIFIED);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setResizable(false);
            stage.show();
        } else {
            System.out.println("Entered index is out of bound");
        }
    }

    private void setDefaultScenes() {

        try {
            Parent menuRoot = FXMLLoader.load(getClass().getResource("/GuessThatCurrency/Resources/Menu.fxml"));
            Parent gameRoot = FXMLLoader.load(getClass().getResource("/GuessThatCurrency/Resources/Game.fxml"));
            Parent deadRoot = FXMLLoader.load(getClass().getResource("/GuessThatCurrency/Resources/Dead.fxml"));

            Scene menuScene = new Scene(menuRoot);
            Scene gameScene = new Scene(gameRoot);
            Scene deadScene = new Scene(deadRoot);

            scenes.add(menuScene);
            scenes.add(gameScene);
            scenes.add(deadScene);


        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
