import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LecteurFichier {
    private static final String NOM_FICHIER = "mon_document.txt";
    
    public static void main(String[] args) {
        File fichier = new File(NOM_FICHIER);

        if (!fichier.exists()) {
            System.out.println("Le fichier " + NOM_FICHIER + " n'existe pas. Création en cours...");
            creerFichierVide(fichier);
        } else {
            lireContenuFichier(fichier);
        }
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

    private static void lireContenuFichier(File fichier) {
        try (BufferedReader lecteur = new BufferedReader(
                new InputStreamReader(new FileInputStream(fichier), StandardCharsets.UTF_8))) {
            
            System.out.println("\nContenu du fichier " + NOM_FICHIER + ":\n");
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier: " + e.getMessage());
        }
    }
}