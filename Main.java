package GuessThatCurrency;

import GuessThatCurrency.Controllers.GameController;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {

    public static final Engine GAME_ENGINE = new Engine();
    public static final SceneManager SCENE_MANAGER = new SceneManager();
    public static Stage main_Stage;


    @Override
    public void start(Stage primaryStage) throws Exception {

        main_Stage = primaryStage;
        main_Stage.getIcons().add(new Image(getClass().getResourceAsStream("/GuessThatCurrency/Resources/Images/Logo.png")));
        GAME_ENGINE.setDefaultParameters();
        GAME_ENGINE.setDefaultStatus();
        SCENE_MANAGER.setCurrentScene(0);

    }

    //123456789-123456789-123456789-123456789
    //123456789-123456789-123456789-123456789-12345
    public static void main(String[] args) {

//        File folder = new File("D:\\Programming\\Portfolio\\Guess That Currency\\src\\GuessThatCurrency\\Resources\\Images\\Coins\\Flat");
//        File[] listOfFiles = folder.listFiles();
//
//        for (int i = 0; i < listOfFiles.length; i++) {
//            if (listOfFiles[i].isFile()) {
//                System.out.println("File " + listOfFiles[i].getPath());
//            } else if (listOfFiles[i].isDirectory()) {
//                System.out.println("Directory " + listOfFiles[i].getName());
//            }
//        }

        launch(args);


    }
}
