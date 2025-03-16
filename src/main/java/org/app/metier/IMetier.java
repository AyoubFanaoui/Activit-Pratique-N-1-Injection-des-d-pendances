package org.app.metier;

import org.app.dao.IDao;

public interface IMetier {
    void setDao(IDao dao);
    double calcular();
}
