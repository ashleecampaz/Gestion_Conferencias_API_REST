/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.cauca.chair_service.access;

import co.edu.cauca.chair_service.domain.Chair;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ashlee Campaz
 */
public interface IChairRepository extends CrudRepository <Chair, Long> {
    
}
