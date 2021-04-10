package com.tematihonov;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalsMapper {
    // 1. Для всех объектов, которые непосредственно хранятся в БД, реализовать шаблон Data Mapper.
    // Структура таблицы:
    //    idAnimal int primary key
    //    type varchar(32)
    //    name varchar(32)
    //    habitat varchar(32)

    private final Connection connection;

    public AnimalsMapper(Connection connection) {
        this.connection = connection;
    }

    public Animal findByType(int idAnimal) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT IDANIMAL, TYPE, NAME, HABITAT FROM ANIMAL WHERE TYPE = ?");
        statement.setInt(1, idAnimal);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Animal animal = new Animal();
                animal.setType(resultSet.getString(1));
                animal.setName(resultSet.getString(2));
                animal.setHabitat(resultSet.getString(3));
                return animal;
            }
        }
        return null;
    }
    public void insert(Animal animal) {
    }

    public void update(Animal animal) {
    }

    public void delete(Animal animal) {
    }

}