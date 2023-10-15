package tn.tuniprob.employe;

import java.util.ArrayList;

public abstract class Employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;

    public String getNom() {
        return nom;
    }

    public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }
    public void afficherDetails() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Nombre d'heures par mois : " + nbr_heures);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }
}

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Numéro de caisse : " + numeroDeCaisse);
    }

    public double calculerSalaire() {
        double salaire = nbr_heures * 5;
        if (nbr_heures > 180) {
            salaire += (nbr_heures - 180) * 7.5;
        }
        return salaire;
    }
}

public class Responsable extends Employe {
    private double prime;

    public double getPrime() {
        return prime;
    }

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Prime : " + prime);
    }

    public double calculerSalaire() {
        double salaire = nbr_heures * 10;
        if (nbr_heures > 160) {
            salaire += (nbr_heures - 160) * 12;
        }
        return salaire + prime;
    }
}

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Taux de vente : " + tauxDeVente);
    }

    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100);
    }
}




