/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.cauca.chair_service.services;

import co.edu.cauca.chair_service.access.IChairRepository;
import co.edu.cauca.chair_service.domain.Chair;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ashlee Campaz
 */
@Component
public class ChairService implements IChairService{
    @Autowired
    IChairRepository chairAccess;
    
    @Override
    @Transactional
    public List<Chair> findAll() {
        return (List<Chair>) chairAccess.findAll();
    }

    @Override
    @Transactional
    public Chair findById(Long id) {
        Chair c = chairAccess.findById(id).orElse(null);
       return c;
    }

    @Override
    @Transactional
    public Chair create(Chair chair) {
        return chairAccess.save(chair); 
    }

    @Override
    @Transactional
    public Chair update(Long id, Chair chair) {
       Chair c = findById(id);
        c.setName(chair.getName());
        return chairAccess.save(c);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
          chairAccess.deleteById(id);
    }
    
}
