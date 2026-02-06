package fr.groupe20.projet.application.text;

import fr.groupe20.projet.controller.LogController;
import fr.groupe20.projet.exception.UnknownCommandException;

import java.util.Scanner;

public class EditorTextApplication extends TextApplication {
    @Override
    public void run(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean shouldContinue = true;

        LogController.log("Welcome to the Level Editor");
        LogController.log("Run HELP for help");

        while (shouldContinue) {
            System.out.println("# ");
            String line = input.nextLine().toUpperCase();

            switch (line) {
                case "QUIT":
                    shouldContinue = false;
                    break;
                case "HELP":
                    showHelp();
                    break;
                default:
                    throw new UnknownCommandException();
            }
        }

        input.close();
    }

    private void showHelp() {
        //TODO Show commands
    }
}
