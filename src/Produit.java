

import java.util.Date;
import java.text.SimpleDateFormat;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit(int identifiant, String libelle, String marque, double prix, Date dateExpiration) throws ParseException {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }


    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("Le prix ne peut pas être négatif.");
        } else {
            this.prix = prix;
        }
    }
    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void afficher() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libellé : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Identifiant : " + identifiant + "\n" +
                "Libellé : " + libelle + "\n" +
                "Marque : " + marque + "\n" +
                "Prix : " + prix + "\n" +
                "Date d'expiration : " + format.format(dateExpiration);
    }
}
