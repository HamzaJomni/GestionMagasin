import java.util.Arrays;
import tn.tuniprob.produit.*;
import tn.tuniprob.employe.*;

public class Magasin {
    private int identifiant;
    private String adresse;
    private static final int CAPACITE_PROD_MAX = 50;
    private Produit[] produits;
    private int nombreProduits;
    private static int nombreTotalProduits = 0;
    private static final int CAPACITE_EMP_MAX = 20;
    private Employe[] employes;
    private int nombreEmployes;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new Produit[CAPACITE_PROD_MAX];
        this.nombreProduits = 0;
        this.employes = new Employe[CAPACITE_EMP_MAX];
        this.nombreEmployes = 0;
    }

    public void ajouterProduit(Produit produit) {
        if (this.nombreProduits < CAPACITE_PROD_MAX) {
            this.produits[this.nombreProduits] = produit;
            this.nombreProduits++;
            nombreTotalProduits++;
            System.out.println("Le produit a été ajouté avec succès.");
        } else {
            System.out.println("Le magasin est plein. Impossible d'ajouter le produit.");
        }
    }
    public void ajouterEmploye(Employe employe) {
        if (this.nombreEmployes < CAPACITE_EMP_MAX) {
            this.employes[this.nombreEmployes] = employe;
            this.nombreEmployes++;
            System.out.println("L'employé a été ajouté avec succès.");
        } else {
            System.out.println("Le magasin est plein. Impossible d'ajouter l'employé.");
        }
    }
    public  void ajouterEmploye(Produit p) throws MagasinPleinException, PrixNegatifException {
    if (produit.getPrix() < 0) {
        throw new PrixNegatifException("Prix Negatif ");
    }
    else if (employes.length == CAPACITE_EMP_MAX) {
        throw new MagasinPleinException("Le Magasin est Plein ");
    }
    else {
        if(rechercheProd(p)==false){
            if(this.nombreProduits < CAPACITE_PROD_MAX){
                this.produits[this.nombreProduits] = p;
                this.nombreProduits++;
                nombreTotalProduits++;
                }
            else{

                System.out.println("Magasin plein");
            }}
        else {

            System.out.println("le produit existe");
        }
    }

}

    public static int getNombreTotalProduits() {

        return nombreTotalProduits;
    }

        public boolean rechercheProd(Produit produit) {
       for (int i=0;i<comp;i++){
            if (Produit.comparer(produit,produits[i]))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", produits=" + Arrays.toString(produits) +
                ", employes=" + Arrays.toString(employes)+
                '}';
    }
    public void afficherDetails() {
        System.out.println("Identifiant du magasin : " + identifiant);
        System.out.println("Adresse du magasin : " + adresse);
        System.out.println("Produits dans le magasin : ");
        for (int i = 0; i < nombreProduits; i++) {
            Produit produit = produits[i];
            System.out.println("Nom du produit : " + produit.getLibelle() + ", Prix : " + produit.getPrix());
        }
        System.out.println("Employés dans le magasin : ");
        for (int i = 0; i < nombreEmployes; i++) {
            Employe employe = employes[i];
            System.out.println("Détails de l'employé : ");
            employe.afficherDetails();
        }
    }

    public void afficheSalaire() {
        for (int i = 0; i < nombreEmployes; i++) {
            Employe employe = employes[i];
            System.out.println("Salaire de " + employe.getNom() + " : " + employe.calculerSalaire());
        }
    }

    public void afficherPrimesResponsables() {
        for (int i = 0; i < nombreEmployes; i++) {
            Employe employe = employes[i];
            if (employe instanceof Responsable) {
                System.out.println("Prime de " + employe.getNom() + " : " + ((Responsable) employe).getPrime());
            }
        }
    }
    public void afficherNombreEmployesParType() {
        int nombreCaissiers = 0;
        int nombreResponsables = 0;
        int nombreVendeurs = 0;

        for (Employe employe : this.employes) {
            if (employe instanceof Caissier) {
                nombreCaissiers++;
            } else if (employe instanceof Responsable) {
                nombreResponsables++;
            } else if (employe instanceof Vendeur) {
                nombreVendeurs++;
            }
        }

        System.out.println("Nombre de caissiers : " + nombreCaissiers);
        System.out.println("Nombre de responsables : " + nombreResponsables);
        System.out.println("Nombre de vendeurs : " + nombreVendeurs);
    }



}
