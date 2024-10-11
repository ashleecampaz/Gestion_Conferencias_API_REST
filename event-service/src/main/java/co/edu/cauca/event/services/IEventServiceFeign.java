/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.cauca.event.services;

import co.edu.cauca.event.access.IEventRepository;
import co.edu.cauca.event.domain.Chair;
import co.edu.cauca.event.domain.Event;
import co.edu.cauca.event.domain.Researcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ashlee Campaz
 */
@Service("serviceFeign")
public class IEventServiceFeign implements IEventService {
    @Autowired
    IEventRepository eventAcces;
    
    @Autowired
    private IChairClientRest chairClient;
    
    @Autowired
    private IResearcherClientRest researcherClient;
    
    @Override
    public List<Event> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Event findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Event create(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Event update(Long id, Event event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Researcher> findAllResearcher(Long id) {
        Event e = eventAcces.findById(id).orElse(null);
        List<Researcher> lista = new ArrayList(); 
        for(Researcher r: e.getComiteDeprograma()){
            lista.add(researcherClient.detail(r.getResearcher_id()));
        } 
        return lista;
    }

    @Override
    public Chair findChair(Long id) {
        Event e = eventAcces.findById(id).orElse(null);
        return chairClient.detail(e.getChair().getId());
    }
    
}
