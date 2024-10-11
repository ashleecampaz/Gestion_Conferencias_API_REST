/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.cauca.event.services;

import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * @author Ashlee Campaz
 */
@FeignClient(name = "researcher-service", url = "localhost:8002")
public interface IResearcherClientRest {
    
}
