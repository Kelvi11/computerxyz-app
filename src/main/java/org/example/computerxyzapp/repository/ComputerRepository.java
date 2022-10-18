package org.example.computerxyzapp.repository;

import org.example.computerxyzapp.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepository {

    public List<Computer> getAll(){
        return new ArrayList<>();
    }

    public void insert(Computer computer){}

    public Computer getById(int id){
        return new Computer();
    }

    public void update(int id, Computer computer){}

    public void delete(int id){}

}
