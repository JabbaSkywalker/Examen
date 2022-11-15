/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Scex;

import com.example.examenFinal.Scex.Scex;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
 *
 * @author gpafu
 */
public interface ScexRepositorio extends Repository<Scex, Integer>{
    List<Scex>findAll();
    Scex findById(int id);
    Scex save(Scex s);
    void delete(Scex s);
}
