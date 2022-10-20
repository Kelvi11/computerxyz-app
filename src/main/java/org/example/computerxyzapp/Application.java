package org.example.computerxyzapp;

import org.example.computerxyzapp.model.Computer;
import org.example.computerxyzapp.model.enums.Ram;
import org.example.computerxyzapp.repository.ComputerRepository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Application {

    public static void main(String[] args) {
//            testConnection();
//            testGetAll();
//            testInsert();
//            testGetById();
//            testUpdate();
//            testDelete();
    }

    private static void testConnection() {

        String connectionUrl = "jdbc:mysql://localhost:3306/computerdb";
        String username = "root";
        String password = "P@ss1234";

        try(Connection connection = DriverManager.getConnection(connectionUrl, username, password)){
            System.out.println("Database connected!");
        }
        catch (SQLException sqle) {

        }
    }

    private static void testGetAll() {

        ComputerRepository computerRepository = new ComputerRepository();

        List<Computer> computers = computerRepository.getAll();

        System.out.println(computers);
    }

    private static void testInsert() {

        Computer computer = createComputer();

        ComputerRepository computerRepository = new ComputerRepository();
        computerRepository.insert(computer);
    }

    private static Computer createComputer() {

        Computer computer = new Computer();

        computer.setId(1);
        computer.setBrand("Hp");
        computer.setPrice(1_100);
        computer.setStorage(500);
        computer.setRam(Ram.SIXTEEN);
        computer.setReleaseDate(LocalDate.of(2022, Month.SEPTEMBER, 1));

        return computer;
    }

    private static void testGetById() {
        int id = 1;

        ComputerRepository computerRepository = new ComputerRepository();
        Computer computer = computerRepository.getById(id);

        System.out.println(computer);
    }

    private static void testUpdate() {
        Computer computer = createComputerForUpdate();

        ComputerRepository computerRepository = new ComputerRepository();
        computerRepository.update(computer);
    }

    private static Computer createComputerForUpdate() {

        Computer computer = new Computer();

        computer.setId(1);
        computer.setBrand("Hp");
        computer.setPrice(1_100);
        computer.setStorage(500);
        computer.setRam(Ram.SIXTEEN);
        computer.setReleaseDate(LocalDate.of(2022, Month.SEPTEMBER, 1));

        return computer;
    }

    private static void testDelete() {
        int id = 0;

        ComputerRepository computerRepository = new ComputerRepository();
        computerRepository.delete(id);
    }
}
