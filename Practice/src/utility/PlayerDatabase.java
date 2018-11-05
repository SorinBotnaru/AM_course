package utility;

import Practice_12_5_AND_15_2.Player;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlayerDatabase {
    public String playersList = "Ahmed Hassan,"
            + "Mohamed Al-Deayea,"
            + "Claudio Suárez,"
            + "Gianluigi Buffon,"
            + "Hossam Hassan,"
            + "Iván Hurtado,"
            + "Vitālijs Astafjevs,"
            + "Iker Casillas,"
            + "Cobi Jones,"
            + "Bader Al-Mutawa,"
            + "Adnan Al-Talyani,"
            + "Sergio Ramos,"
            + "Essam El-Hadary,"
            + "Martin Reim,"
            + "Landon Donovan,"
            + "Sami Al-Jaber,"
            + "Salman Isa";

    int rand_val = 0;

    public Player[] getTeam(int numberOfPLayers) throws PlayerDatabaseException {
        ArrayList<String> listTokens = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(playersList);

         Player[] playersTeam = new Player[numberOfPLayers];
        while (stringTokenizer.hasMoreTokens()) {
            listTokens.add(stringTokenizer.nextToken(","));
        }
        int j = 0;
        try {
            for (int i = rand_val; i < rand_val + numberOfPLayers; i++) {
                playersTeam[j++] = new Player(listTokens.get(i));
            }
        }
        catch (IndexOutOfBoundsException e){
            throw new PlayerDatabaseException("Not enough player's in the database for the teams requested");
        }

        rand_val += numberOfPLayers;
        if (rand_val == playersList.length()) {
            rand_val = 0;
        }

        return playersTeam;
    }

}