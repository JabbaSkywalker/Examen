/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Slafi;

import com.example.examenFinal.Slafi.Slafi;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author gpafu
 */

public interface SlafiRepositorio extends Repository<Slafi, Integer>{
    
    List<Slafi>findAll();
    Slafi findById(int id);
    Slafi save(Slafi s);
    void delete(Slafi s);
}
