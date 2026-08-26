package org.example.project1.repository;

import org.example.project1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Laptop is data is save");
    }
}
