package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

    public static void main(String[] args) throws InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {

        /* Affichage des nom attributs */
        Class cls = Salle.class;
        Field[] attributs = cls.getDeclaredFields();
        for (Field att : attributs) {
            System.out.println(att.getName());
        }
        /* Affichage des nom methodes */
        Method[] methods = cls.getDeclaredMethods();
        for (Method meth : methods) {
            System.out.println(meth.getName());
        }
        /* Instanciation des objets par reflection */
        Salle o1 = null;
        Salle o2 = null;
        Salle o3 = null;
        Constructor[] cons = cls.getDeclaredConstructors();
        for (Constructor c : cons) {
            int count = c.getParameterCount();
            switch (count) {
                case 0: {
                    o1 = (Salle) c.newInstance();
                    break;
                }
                case 1: {
                    o2 = (Salle) c.newInstance("Salle Informatique");
                    break;
                }
                case 2: {
                    o3 = (Salle) c.newInstance(2, "Salle des cours");
                    break;

                }
                default: {
                    break;
                }
            }
        }
        System.out.println(o1.id + "" + o1.nom);
        System.out.println(o2.id + "" + o2.nom);
        System.out.println(o3.id + "" + o3.nom);


        }

    }
