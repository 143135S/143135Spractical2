package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by 143135s on 11/12/2015.
 */
public class EMF {
    private static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("bookstore");
    private EMF(){}
    public static EntityManagerFactory get(){
        return emfInstance;
    }
}
