/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.cauca.chair_service.presentation;

import co.edu.cauca.chair_service.domain.Chair;
import co.edu.cauca.chair_service.services.IChairService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ashlee Campaz
 */
@RestController
@Component
@RequestMapping("/Chair")
public class ChairController {
    
    @Autowired
    IChairService chairService;
    
    @RequestMapping(method = RequestMethod.GET, produces =
    "application/json")
     @ResponseBody
     public List<Chair> findAll() {
     return chairService.findAll();
     }
     @RequestMapping(method = RequestMethod.POST, produces =
    "application/json")
     @ResponseBody
     public Chair create(@RequestBody Chair chair) {
     return chairService.create(chair);
     }
     /* Get a Event by ID */
     @GetMapping("/{id}")
     public Chair getChairById(@PathVariable Long id) {
     return chairService.findById(id);
    }
}
