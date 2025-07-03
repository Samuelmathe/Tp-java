import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EcrivainFichier {
    private static final String NOM_FICHIER = "mon_document.txt";
    private static final String[] LIGNES_A_ECRIRE = {
        "Bonjour et bienvenue dans ce fichier texte",
        "Ce programme démontre l'écriture et la lecture de fichiers en Java",
        "Nous utilisons les classes BufferedWriter et FileWriter pour écrire",
        "Et BufferedReader pour la lecture",
        "Ces méthodes sont efficaces pour gérer les fichiers texte",
        "Bonne pratique de programmation !"
    };

    public static void main(String[] args) {
        File fichier = new File(NOM_FICHIER);

        if (!fichier.exists()) {
            System.out.println("Le fichier " + NOM_FICHIER + " n'existe pas. Création en cours...");
            creerFichierVide(fichier);
        }

        ecrireDansFichier(fichier);
    }

    private static void creerFichierVide(File fichier) {
        try {
            if (fichier.createNewFile()) {
                System.out.println("Fichier créé avec succès: " + fichier.getName());
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier: " + e.getMessage());
        }
    }

    private static void ecrireDansFichier(File fichier) {
        try (FileWriter ecrivain = new FileWriter(fichier);
             BufferedWriter tamponEcriture = new BufferedWriter(ecrivain)) {
            
            System.out.println("\nÉcriture dans le fichier " + NOM_FICHIER + "...");
            
            for (String ligne : LIGNES_A_ECRIRE) {
                tamponEcriture.write(ligne);
                tamponEcriture.newLine();
            }
            
            System.out.println("Contenu écrit avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier: " + e.getMessage());
        }
    }
}