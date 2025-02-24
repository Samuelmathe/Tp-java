
// Classe Institution
class Institution {
    private String nomInstitution;
    private String paysInstitution;
    private String typeInstitution;
    private int anneeCreation;

    public Institution(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation) {
        this.nomInstitution = nomInstitution;
        this.paysInstitution = paysInstitution;
        this.typeInstitution = typeInstitution;
        this.anneeCreation = anneeCreation;
    }

    public String getNomInstitution() {
        return nomInstitution;
    }

    public String getPaysInstitution() {
        return paysInstitution;
    }

    public String getTypeInstitution() {
        return typeInstitution;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setNomInstitution(String nomInstitution) {
        this.nomInstitution = nomInstitution;
    }

    public void setPaysInstitution(String paysInstitution) {
        this.paysInstitution = paysInstitution;
    }

    public void setTypeInstitution(String typeInstitution) {
        this.typeInstitution = typeInstitution;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public int calculerAge() {
        return 2025 - anneeCreation; // Supposons que l'année actuelle est 2025
    }

    public String decrire() {
        return "Nom: " + nomInstitution + ", Pays: " + paysInstitution + ", Type: " + typeInstitution + 
               ", Année de création: " + anneeCreation + ", Âge: " + calculerAge() + " ans";
    }
}

// Classe Universite
class Universite extends Institution {
    private int nombreFaculte;
    private String systemeEnseignement;
    private String nomRecteur;

    public Universite(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, 
                      int nombreFaculte, String systemeEnseignement, String nomRecteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systemeEnseignement = systemeEnseignement;
        this.nomRecteur = nomRecteur;
    }

    public int getNombreFaculte() {
        return nombreFaculte;
    }

    public String getSystemeEnseignement() {
        return systemeEnseignement;
    }

    public String getNomRecteur() {
        return nomRecteur;
    }

    public void setNombreFaculte(int nombreFaculte) {
        this.nombreFaculte = nombreFaculte;
    }

    public void setSystemeEnseignement(String systemeEnseignement) {
        this.systemeEnseignement = systemeEnseignement;
    }

    public void setNomRecteur(String nomRecteur) {
        this.nomRecteur = nomRecteur;
    }

    @Override
    public String decrire() {
        return super.decrire() + ", Nombre de facultés: " + nombreFaculte + 
               ", Système d'enseignement: " + systemeEnseignement + ", Recteur: " + nomRecteur;
    }

    public static String donnerNomsRecteurs(Universite u1, Universite u2) {
        return "Recteur de " + u1.getNomInstitution() + ": " + u1.getNomRecteur() + 
               ", Recteur de " + u2.getNomInstitution() + ": " + u2.getNomRecteur();
    }
}

// Classe Ecole
class Ecole extends Institution {
    private String type;
    private int nombreClasses;
    private String nomPromoteur;

    public Ecole(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, 
                 String type, int nombreClasses, String nomPromoteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.type = type;
        this.nombreClasses = nombreClasses;
        this.nomPromoteur = nomPromoteur;
    }

    public String getType() {
        return type;
    }

    public int getNombreClasses() {
        return nombreClasses;
    }

    public String getNomPromoteur() {
        return nomPromoteur;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNombreClasses(int nombreClasses) {
        this.nombreClasses = nombreClasses;
    }

    public void setNomPromoteur(String nomPromoteur) {
        this.nomPromoteur = nomPromoteur;
    }

    @Override
    public String decrire() {
        return super.decrire() + ", Type: " + type + ", Nombre de classes: " + nombreClasses + 
               ", Promoteur: " + nomPromoteur;
    }

    public static String donnerNomsPromoteurs(Ecole e1, Ecole e2, Ecole e3) {
        return "Promoteur de " + e1.getNomInstitution() + ": " + e1.getNomPromoteur() + 
               ", Promoteur de " + e2.getNomInstitution() + ": " + e2.getNomPromoteur() + 
               ", Promoteur de " + e3.getNomInstitution() + ": " + e3.getNomPromoteur();
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Création d'une institution
        Institution institution = new Institution("ULPGL", "Congo", "Privée", 2005);
        System.out.println("Description de l'institution:");
        System.out.println(institution.decrire());

        // Création d'une université
        Universite universite1 = new Universite("ULPGL", "Congo", "Privée", 2005, 5, "LMD", "Samuel");
        Universite universite2 = new Universite("Université la sapiensa", "Congo", "Publique", 1990, 8, "LMD", "Jean");
        System.out.println("Description de l'université 1:");
        System.out.println(universite1.decrire());
        System.out.println("Description de l'université 2:");
        System.out.println(universite2.decrire());
        System.out.println("Noms des recteurs:");
        System.out.println(Universite.donnerNomsRecteurs(universite1, universite2));

        // Création d'écoles
        Ecole ecole1 = new Ecole("École Primaire teresa mira ", "Congo", "Privée", 2010, "Primaire", 10, "Alice");
        Ecole ecole2 = new Ecole("École Secondaire la conconrde", "Congo", "Publique", 2000, "Secondaire", 20, "joseph");
        Ecole ecole3 = new Ecole("École Primaire de volcan", "Congo", "Privée", 2015, "Primaire", 15, "Charlie");
        System.out.println("Description de l'école 1:");
        System.out.println(ecole1.decrire());
        System.out.println("Description de l'école 2:");
        System.out.println(ecole2.decrire());
        System.out.println("Description de l'école 3:");
        System.out.println(ecole3.decrire());
        System.out.println("Noms des promoteurs:");
        System.out.println(Ecole.donnerNomsPromoteurs(ecole1, ecole2, ecole3));
    }
}
