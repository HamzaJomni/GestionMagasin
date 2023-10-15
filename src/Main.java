import tn.tuniprob.magasin.Magasin;
import tn.tuniprob.produit.Produit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; // Importez la classe Date

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Section produit *****************************************************************************************************
            // Compléter les informations manquantes pour chaque produit
            Produit produit1 = new Produit(1021, "Lait", "Delice", 2.20, format.parse("22/09/2023"));
            Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.55, format.parse("23/09/2023"));
            Produit produit3 = new Produit(3250, "Yaourt", "Sicam", 1.2, format.parse("24/09/2023"));

            System.out.println("Produit 1 :\n" + produit1.toString());
            System.out.println("Produit 2 :\n" + produit2.toString());
            System.out.println("Produit 3 :\n" + produit3.toString());

            produit1.setPrix(0.70);
            System.out.println("Produit 1 :\n" + produit1.toString());

            produit1.setDateExpiration(format.parse("01/10/2023"));
            System.out.println("Produit 1 :\n" + produit1.toString());
            // Section produit *****************************************************************************************************

            // Section Magasin *****************************************************************************************************
            Magasin magasin = new Magasin(1, "7 Rue Géneral kheirddine");

            // Initialisation du tableau produits dans le constructeur de Magasin
            magasin.ajouterProduit(produit1);
            magasin.ajouterProduit(produit2);
            magasin.afficherDetails();

            System.out.println("Nombre total de produits dans tous les magasins : " + Magasin.getNombreTotalProduits());

            Magasin magasin2 = new Magasin(2, "Carrefour, Centre-Ville");
            Magasin magasin3 = new Magasin(3, "Monoprix, Menzah 6");
            // Section Magasin *****************************************************************************************************

            // Section Employe ****************************************************************************************
            // magasin 2
            Caissier caissier1 = new Caissier(1, "Caissier 1", "Adresse C1", 160, 1);
            Caissier caissier2 = new Caissier(2, "Caissier 2", "Adresse C2", 160, 2);
            Vendeur vendeur1 = new Vendeur(1, "Vendeur 1", "Adresse V1", 160, 0.10);
            Responsable responsable1 = new Responsable(1, "Responsable 1", "Adresse R1", 200, 500.0);

            magasin2.ajouterEmploye(caissier1);
            magasin2.ajouterEmploye(caissier2);
            magasin2.ajouterEmploye(vendeur1);
            magasin2.ajouterEmploye(responsable1);

            caissier1.afficherDetails();
            caissier1.afficherDetails();
            vendeur1.afficherDetails();
            responsable1.afficherDetails();

            // Magasin 2

            // Création des employés pour le deuxième magasin
            Caissier caissier3 = new Caissier(3, "Caissier 3", "Adresse C3", 160, 3);
            Vendeur vendeur2 = new Vendeur(2, "Vendeur 2", "Adresse V2", 160, 0.10);
            Vendeur vendeur3 = new Vendeur(3, "Vendeur 3", "Adresse V3", 160, 0.10);
            Vendeur vendeur4 = new Vendeur(4, "Vendeur 4", "Adresse V4", 160, 0.10);
            Responsable responsable2 = new Responsable(2, "Responsable 2", "Adresse R2", 200, 500.0);

            // Ajout des employés au deuxième magasin
            magasin3.ajouterEmploye(caissier3);
            magasin3.ajouterEmploye(vendeur2);
            magasin3.ajouterEmploye(vendeur3);
            magasin3.ajouterEmploye(vendeur4);
            magasin3.ajouterEmploye(responsable2);

            caissier3.afficherDetails();
            vendeur2.afficherDetails();
            vendeur3.afficherDetails();
            vendeur4.afficherDetails();
            responsable2.afficherDetails();

            System.out.println("Salaire du Caissier 3 : " + caissier3.calculerSalaire() + " DT");
            System.out.println("Salaire du Vendeur 2 : " + vendeur2.calculerSalaire() + " DT");
            System.out.println("Salaire du Vendeur 3 : " + vendeur3.calculerSalaire() + " DT");
            System.out.println("Salaire du Vendeur 4 : " + vendeur4.calculerSalaire() + " DT");
            System.out.println("Salaire du Responsable 2 : " + responsable2.calculerSalaire() + " DT");
            // Section Employe ****************************************************************************************
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
