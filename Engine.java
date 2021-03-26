package GuessThatCurrency;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;

public class Engine {

    public ArrayList<Coin> coinsInPlay = new ArrayList<>();
    public ArrayList<Boolean> coinsInPlayStatus = new ArrayList<>();

    public int currentCoin = 0;
    public int previousCoin = 0;
    public int triesLeft = 3;

    private boolean debugMode = false;

    public ArrayList<Coin> getCoinsInPlay() {
        return this.coinsInPlay;
    }

    public void setDefaultParameters() {

        addNewCoin(newCoin(
                "ARS",
                "$",
                "Argentina",
                0.01,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/argentine-peso.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/argentine-peso-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "AWG",
                "f",
                "Aruba",
                0.56,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/aruban-florin.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/aruban-florin-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "BSD",
                "B$",
                "Bahamas",
                1.00,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/bahamanian-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/bahamanian-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));


        addNewCoin(newCoin(
                "BBD",
                "Bds$",
                "Barbados",
                0.50,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/barbadian-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/barbadian-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "BZD",
                "BZ$",
                "Belize",
                0.50,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/belize-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/belize-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "BMD",
                "$",
                "Bermuda",
                1.00,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/bermudian-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/bermudian-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "BOB",
                "$B",
                "Bolivia",
                0.15,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/bolivian-boliviano.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/bolivian-boliviano-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "BRL",
                "R$",
                "Brazil",
                0.08,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/brazilian-real.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/brazilian-real-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "USD",
                "$",
                "United States",
                1.00,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/british-virgin-islands-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/british-virgin-islands-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CAD",
                "$",
                "Canada",
                0.80,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/canadian-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/canadian-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "KYD",
                "$",
                "Cayman Islands",
                1.21,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/cayman-islands-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/cayman-islands-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CLP",
                "$",
                "Chile",
                0.0014,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/chilean-peso.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/chilean-peso-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CLP",
                "$",
                "Colombia",
                0.0003,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/colombian-peso.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/colombian-peso-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CRC",
                "C",
                "Costa Rica",
                0.0003,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/costa-rican-colon.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/costa-rican-colon-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CUP",
                "$MN",
                "Cuba",
                0.04,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/cuba-peso.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/cuba-peso-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "CUP",
                "RD$",
                "Dominican Republic",
                0.02,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/dominican-peso.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/dominican-peso-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "XCD",
                "$",
                "East Caribbean",
                0.369,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/east-caribbean-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/east-caribbean-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "ECS",
                "$",
                "Ecuador",
                0.01,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/ecuadorian-centavo.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/ecuadorian-centavo-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "FKP",
                "E",
                "Falkland Islands",
                0.01,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/falkland-islands-pound.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/falkland-islands-pound-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));

        addNewCoin(newCoin(
                "FKP",
                "E",
                "Falkland Islands",
                0.01,
                "/GuessThatCurrency/Resources/Images/Coins/Flat/grenada-dollar.png",
                "/GuessThatCurrency/Resources/Images/Coins/Color/grenada-dollar-color.png",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi",
                "abcdefghi-abcdefghi-abcdefghi-abcdefghi"));


        currentCoin = 0;
        previousCoin = 0;
        triesLeft = 3;
        Collections.shuffle(coinsInPlay);
        setDefaultStatus();
    }

    public void setDefaultStatus() {
        if (debugMode) {
            for (int i = 0; i < coinsInPlay.size(); i++) {
                coinsInPlayStatus.add(Boolean.TRUE);
            }
        } else {
            for (int i = 0; i < coinsInPlay.size(); i++) {
                coinsInPlayStatus.add(Boolean.FALSE);
            }
        }
    }

    public void newGame() {
        Collections.shuffle(coinsInPlay);
        setDefaultStatus();
        currentCoin = 0;
        previousCoin = 0;
        triesLeft = 3;
    }

    public Coin newCoin(String code, String symbol, String location, Double value, String flat_image_location, String color_image_location, String hint_one, String hint_two) {
        return new Coin(code, symbol, location, value, flat_image_location, color_image_location, hint_one, hint_two);
    }

    public void addNewCoin(Coin newCoin) {
        if (newCoin != null) {
            coinsInPlay.add(newCoin);
        }
    }

    public Image getColorImage() {


        try {
            System.out.println(getClass().getResource(coinsInPlay.get(currentCoin).COLOR_IMAGE_LOCATION).toURI().toString());
            return new Image(getClass().getResource(coinsInPlay.get(currentCoin).COLOR_IMAGE_LOCATION).toURI().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Image getFlatImage() {


        try {
            System.out.println(getClass().getResource(coinsInPlay.get(currentCoin).FLAT_IMAGE_LOCATION).toURI().toString());
            return new Image(getClass().getResource(coinsInPlay.get(currentCoin).FLAT_IMAGE_LOCATION).toURI().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void previousCoin() {
        //System.out.println("Entered with " + currentCoin);
        if (currentCoin != 0) {
            previousCoin = currentCoin - 1;
            --currentCoin;
        }
        //System.out.println("Left with " + currentCoin);
    }

    public void nextCoin() {
        //System.out.println("Entered with " + currentCoin);
        if (currentCoin != coinsInPlay.size() - 1) {
            previousCoin = currentCoin;
            ++currentCoin;
        }
        //System.out.println("Left with " + currentCoin);
    }

    public boolean guessMade(String guess) {

        if (triesLeft > 0) {
            if (guess.equalsIgnoreCase(this.coinsInPlay.get(currentCoin).CODE)
                    || (guess.equalsIgnoreCase(this.coinsInPlay.get(currentCoin).SYMBOL)
                    || (guess.equalsIgnoreCase(this.coinsInPlay.get(currentCoin).LOCATION)))) {

                coinsInPlayStatus.set(currentCoin, true);

                return true;
            }
        }

        return false;
    }

    public void wrongAnswerPenalty() {
        if (triesLeft > 0) {
            --triesLeft;
        }
    }
}
