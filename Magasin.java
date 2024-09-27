package tn.tuniprod.gestionmagasin;

import tn.tuniprod.gestionmagasin.Produit;

public class Magasin {
    int id;
    String adress;
    public static final int capacite = 50;
    int index =0;
    Produit[] produits = new Produit[capacite];

    public Magasin() {}

    public  Magasin(int id, String adress) {
        this.id = id;
        this.adress = adress;
    }
    public void ajouterProduit(Produit p) {
        if (index < capacite) {
            produits[index]=p;
            index ++;
        } else {
            System.out.println("La capacité maximale du magasin est atteinte.");
        }
    }

    public void afficherMagasin() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adress);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits dans le magasin:");
        for (Produit produit : produits) {
            if (produit != null) {
                produit.Afficher();

            }
        }
    }
}


