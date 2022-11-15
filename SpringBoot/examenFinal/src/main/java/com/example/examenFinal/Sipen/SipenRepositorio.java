/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Sipen;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
 *
 * @author gpafu
 */
public interface SipenRepositorio extends Repository<Sipen, Integer>{
    List<Sipen>findAll();
    Sipen findById(int id);
    Sipen save(Sipen s);
    void delete(Sipen s);
}
