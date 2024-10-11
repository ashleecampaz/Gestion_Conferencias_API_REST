/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.cauca.event.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author Ashlee Campaz
 */
@Entity
@Table (name = "Chair")
public class Chair {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chair_id;        
    
    public Long getId() {
        return chair_id;
    }
}
