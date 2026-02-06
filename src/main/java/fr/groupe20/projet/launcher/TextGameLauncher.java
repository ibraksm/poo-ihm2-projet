package fr.groupe20.projet.launcher;

import fr.groupe20.projet.application.text.GameTextApplication;
import fr.groupe20.projet.application.text.TextApplication;

public class TextGameLauncher {
    public static void main(String[] args) {
        TextApplication app = new GameTextApplication();

        try {
            app.run(args);
        } catch (Exception ignored) {}
    }
}
