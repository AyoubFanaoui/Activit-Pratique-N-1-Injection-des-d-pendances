package org.app.metier;

import org.app.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    // Injection de dépendance via le setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcular() {
        double data = dao.gitData();
        return data * 10;
    }
}
