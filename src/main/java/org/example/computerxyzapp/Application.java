package org.example.computerxyzapp;

import org.example.computerxyzapp.model.Computer;
import org.example.computerxyzapp.repository.ComputerRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Application {

    public static void main(String[] args) {
            testGetAll();
//            testInsert();
//            testGetById();
//            testUpdate();
//            testDelete();
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
        computer.setStorage(16);
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
        int id = 1;
        Computer computer = createComputerForUpdate();

        ComputerRepository computerRepository = new ComputerRepository();
        computerRepository.update(id, computer);
    }

    private static Computer createComputerForUpdate() {

        Computer computer = new Computer();

        computer.setBrand("Hp");
        computer.setPrice(1_100);
        computer.setStorage(500);
        computer.setStorage(16);
        computer.setReleaseDate(LocalDate.of(2022, Month.SEPTEMBER, 1));

        return computer;
    }

    private static void testDelete() {
        int id = 1;

        ComputerRepository computerRepository = new ComputerRepository();
        computerRepository.delete(id);
    }
}
