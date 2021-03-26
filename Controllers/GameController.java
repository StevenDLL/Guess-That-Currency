package GuessThatCurrency.Controllers;

import GuessThatCurrency.LimitedTextField;
import GuessThatCurrency.Main;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


public class GameController /* implements Initializable */ {
    public AnchorPane mainPane;
    public ImageView coinToGuess_ImageView;
    public ImageView leftArrow_ImageView;
    public ImageView rightArrow_ImageView;
    public ImageView hint_ImageView;
    public TextField guess_TextField;
    public Group lives_group;
    public ImageView heart1_ImageView;
    public ImageView heart2_ImageView;
    public ImageView heart3_ImageView;
    public ImageView settings_ImageView;
    public ImageView submit_ImageView;
    public Label currentCoin_Label;
    public Label clickToReveal_Label;
    public ImageView color_ImageView;
    public TextField hintOne_TextField;
    public TextField hintTwo_TextField;

    public void coinToGuess_Clicked(MouseEvent mouseEvent) {
        try {

//            guess_TextField.setCharsOnlyFieldwSpace();
//            guess_TextField.setMaxLength(25);
//            hintOne_TextField.setCharsOnlyFieldwSpace();
//            hintOne_TextField.setMaxLength(45);
//            hintTwo_TextField.setCharsOnlyFieldwSpace();
//            hintTwo_TextField.setMaxLength(45);

            leftArrow_ImageView.setVisible(true);
            rightArrow_ImageView.setVisible(true);
            guess_TextField.setVisible(true);
            hint_ImageView.setVisible(true);
            submit_ImageView.setVisible(true);
            color_ImageView.setVisible(true);
            hintOne_TextField.setVisible(true);
            hintTwo_TextField.setVisible(true);

            clickToReveal_Label.setDisable(true);
            clickToReveal_Label.setVisible(false);
            currentCoin_Label.setText(String.valueOf(Main.GAME_ENGINE.currentCoin + 1));
            //coinToGuess_ImageView.setImage(new Image(getClass().getResource(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).FLAT_IMAGE_LOCATION).toURI().toString()));
            color_Clicked(mouseEvent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leftArrow_Clicked(MouseEvent mouseEvent) {
        try {
            if (Main.GAME_ENGINE.coinsInPlayStatus.get(Main.GAME_ENGINE.previousCoin)) {
                Main.GAME_ENGINE.previousCoin();
                coinToGuess_ImageView.setImage(Main.GAME_ENGINE.getColorImage());
                currentCoin_Label.setText(String.valueOf(Main.GAME_ENGINE.currentCoin + 1));
                reset_hints();
            } else {
                System.out.println("no previous level");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void rightArrow_Clicked(MouseEvent mouseEvent) {
        try {
            if (Main.GAME_ENGINE.coinsInPlayStatus.get(Main.GAME_ENGINE.currentCoin)) {
                Main.GAME_ENGINE.nextCoin();
                coinToGuess_ImageView.setImage(Main.GAME_ENGINE.getColorImage());
                currentCoin_Label.setText(String.valueOf(Main.GAME_ENGINE.currentCoin + 1));
                reset_hints();
            } else {
                //Handle showing
                System.out.println("tried skipping level " + Main.GAME_ENGINE.currentCoin + " which you haven't beat");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void hint_Clicked(MouseEvent mouseEvent) {
        if (hintOne_TextField.getText().isBlank()) {
            hintOne_TextField.setText(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).HINT_ONE);
            hintTwo_TextField.setAlignment(Pos.CENTER);
        } else if (hintTwo_TextField.getText().isBlank()) {
            hintTwo_TextField.setText(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).HINT_TWO);
            hintTwo_TextField.setAlignment(Pos.CENTER);
        }
    }

    public void reset_hints() {
        hintOne_TextField.setText("");
        hintTwo_TextField.setText("");
    }


    public void settings_Clicked(MouseEvent mouseEvent) {
        System.out.println("Settings clicked");
    }

    public void submit_Clicked(MouseEvent mouseEvent) {
        if (Main.GAME_ENGINE.triesLeft > 0) {
            if (guess_TextField.getText().length() > 0 && !guess_TextField.getText().isBlank()) {
                if (Main.GAME_ENGINE.guessMade(guess_TextField.getText())) {

                    //Handle getting a guess right
                    System.out.println("right guess");
                    System.out.println(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).toString());

                } else if (!Main.GAME_ENGINE.guessMade(guess_TextField.getText())) {
                    //Handle getting a guess wrong
                    if (!Main.GAME_ENGINE.coinsInPlayStatus.get(Main.GAME_ENGINE.currentCoin)) {
                        if (Main.GAME_ENGINE.triesLeft == 3) {

                            //System.out.println("wrong guess");
                            Main.GAME_ENGINE.wrongAnswerPenalty();
                            heart3_ImageView.setOpacity(0.3);

                        } else if (Main.GAME_ENGINE.triesLeft == 2) {

                            //System.out.println("wrong guess");
                            Main.GAME_ENGINE.wrongAnswerPenalty();
                            heart2_ImageView.setOpacity(0.3);

                        } else if (Main.GAME_ENGINE.triesLeft == 1) {

                            //System.out.println("you are dead");
                            Main.GAME_ENGINE.wrongAnswerPenalty();
                            heart1_ImageView.setOpacity(0.3);
                            //Handle users death.

                            Alert alert = new Alert(Alert.AlertType.NONE);
                            alert.setResizable(false);
                            ImageView temp = new ImageView(new Image(getClass().getResourceAsStream(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).COLOR_IMAGE_LOCATION)));
                            temp.setFitHeight(64);
                            temp.setFitWidth(64);
                            alert.setGraphic(temp);
                            alert.setTitle("YOU DIED");
                            alert.setHeaderText("Answer: " + Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).CODE + " / " + Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).SYMBOL
                                    + " / " + Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).LOCATION
                                    + "\n" + "Score: " + Main.GAME_ENGINE.currentCoin + " out of " + Main.GAME_ENGINE.coinsInPlay.size());
                            alert.setContentText("Try again?");
                            alert.getButtonTypes().add(ButtonType.YES);
                            alert.getButtonTypes().add(ButtonType.NO);
                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.YES) {
                                //Handle restarting the game
                                reset();
                                //System.out.println("pressed try again");
                            } else {
                                reset();
                                Main.SCENE_MANAGER.setCurrentScene(0);
                            }

                        }
                    }
                    //System.out.println(Main.GAME_ENGINE.coinsInPlay.get(Main.GAME_ENGINE.currentCoin).toString());
                }

            } else {
                //Handle not inputting text here
                //System.out.println("tried to submit without text");
            }
        } else {
            System.out.println("you should be dead");
        }


    }

    public void color_Clicked(MouseEvent mouseEvent) {
        if (coinToGuess_ImageView.getImage().getUrl().contains("-color")) {
            //System.out.println("show flat version");
            coinToGuess_ImageView.setImage(Main.GAME_ENGINE.getFlatImage());
        } else {
            //System.out.println("show color version");
            coinToGuess_ImageView.setImage(Main.GAME_ENGINE.getColorImage());
        }
    }


    public void reset() {
        Main.GAME_ENGINE.newGame();
        coinToGuess_ImageView.setImage(Main.GAME_ENGINE.getColorImage());
        currentCoin_Label.setText(String.valueOf(Main.GAME_ENGINE.currentCoin + 1));
        heart1_ImageView.setOpacity(1);
        heart2_ImageView.setOpacity(1);
        heart3_ImageView.setOpacity(1);
        guess_TextField.setText("");
        reset_hints();
    }
//    public void initialize() {
//        System.out.println("hit");
//    }
}
