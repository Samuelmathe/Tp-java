// Interface définissant le comportement d'un véhicule
interface Vehicule {
    void demarrer();
    void arreter();
    int obtenirVitesseMaximale();
}

// Implémentation d'une voiture
class Voiture implements Vehicule {
    private final int vitesseMaximale;

    public Voiture(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage du moteur de la voiture.");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt du moteur de la voiture.");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

// Implémentation d'un vélo
class Velo implements Vehicule {
    private final int vitesseMaximale;

    public Velo(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Début de la pédalade du vélo.");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt du vélo.");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

// Implémentation d'une moto
class Moto implements Vehicule {
    private final int vitesseMaximale;

    public Moto(int vitesseMaximale) {
        this.vitesseMaximale = vitesseMaximale;
    }

    @Override
    public void demarrer() {
        System.out.println("Démarrage du moteur de la moto.");
    }

    @Override
    public void arreter() {
        System.out.println("Arrêt du moteur de la moto.");
    }

    @Override
    public int obtenirVitesseMaximale() {
        return vitesseMaximale;
    }
}

// Classe de test
public class TestVehicules {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture(200);
        Vehicule velo = new Velo(30);
        Vehicule moto = new Moto(180);

        testerVehicule(voiture, "Voiture");
        testerVehicule(velo, "Vélo");
        testerVehicule(moto, "Moto");

        afficherMessageFinal();
    }

    private static void testerVehicule(Vehicule vehicule, String typeVehicule) {
        System.out.println("\n=== Test " + typeVehicule + " ===");
        vehicule.demarrer();
        System.out.println("Vitesse maximale: " + vehicule.obtenirVitesseMaximale() + " km/h");
        vehicule.arreter();
    }

    private static void afficherMessageFinal() {
        System.out.println("\nMerci pour votre attention !");
        
    }
}