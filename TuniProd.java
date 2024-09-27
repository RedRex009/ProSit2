package tn.tuniprod.gestionmagasin;

import java.util.Scanner;
public class TuniProd {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Produit produitVide = new Produit();
//            produitVide.Afficher();

            Produit produit1 = new Produit(1021, "Lait", "Delice", 0);
            Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0);
            Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.20);



            produit1.setPrix(0.700);;

//
//              produit1.Afficher();
//              produit2.Afficher();
//              produit3.Afficher();
//
//
//            System.out.println(produit1.toString());

            Magasin m1 = new Magasin(1,"Delice") ;
            Magasin m2 = new Magasin(2,"Royale") ;


            m1.ajouterProduit(produit1);
            m1.ajouterProduit(produit2);
            m1.afficherMagasin();



        }



}
