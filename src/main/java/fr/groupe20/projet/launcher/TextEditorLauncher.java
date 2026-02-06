package fr.groupe20.projet.launcher;

import fr.groupe20.projet.application.text.EditorTextApplication;
import fr.groupe20.projet.application.text.TextApplication;

public class TextEditorLauncher {
    public static void main(String[] args) {
        TextApplication app = new EditorTextApplication();

        try {
            app.run(args);
        } catch (Exception ignored) {}
    }
}
