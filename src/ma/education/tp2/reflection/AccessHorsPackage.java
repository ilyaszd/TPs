package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

public class AccessHorsPackage extends Salle {

    public AccessHorsPackage(long id, String nom) {
        super(id, nom);
    }

    public static void main(String[] args) {
        Salle s1 = new Salle("Salle B");
        System.out.println(s1.id );
        System.out.println(s1.nom );
    }


    public void afficher(Salle s) {
        System.out.println(s.id );
        System.out.println(s.nom );
        System.out.println(id );
        System.out.println(nom );
    }


}
