/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examenFinal.Slafi;

import com.example.examenFinal.Slafi.SlafiService;
import com.example.examenFinal.Slafi.SlafiRepositorio;
import com.example.examenFinal.Slafi.Slafi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gpafu
 */
@Service
public class SlafiServiceImp implements SlafiService{
    
    @Autowired
    private SlafiRepositorio repositorio;
    
    @Override
    public List<Slafi> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Slafi listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Slafi agregar(Slafi s){
        return repositorio.save(s);
    }
    
    @Override
    public Slafi editar(Slafi s){
        return repositorio.save(s); //verificar y poner un método válido
    }
    
    @Override
    public Slafi eliminar(int id){
        
        return null;   
    }
   
}
