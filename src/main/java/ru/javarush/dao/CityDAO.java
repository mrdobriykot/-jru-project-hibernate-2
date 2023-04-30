package ru.javarush.dao;

import org.hibernate.SessionFactory;
import ru.javarush.entity.City;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
}
