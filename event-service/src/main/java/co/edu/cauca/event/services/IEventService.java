/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.cauca.event.services;

import co.edu.cauca.event.domain.Chair;
import co.edu.cauca.event.domain.Event;
import co.edu.cauca.event.domain.Researcher;
import java.util.List;

/**
 *
 * @author Ashlee Vanessa Campaz
 */
public interface IEventService {
    public List<Event> findAll();
    public Event findById(Long id);
    public Event create(Event event);
    public Event update(Long id, Event event);
    public void deleteById(Long id);
    public List<Researcher> findAllResearcher(Long id); 
    public Chair findChair(Long id); 
}
