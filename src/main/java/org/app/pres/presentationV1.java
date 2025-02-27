package org.app.pres;

import org.app.dao.DaoImpl;
import org.app.dao.IDao;
import org.app.metier.IMetier;
import org.app.metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Res : " + metier.calcular());
    }
}
