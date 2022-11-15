/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examenFinal.Scex;

import com.example.examenFinal.Scex.ScexService;
import com.example.examenFinal.Scex.ScexRepositorio;
import com.example.examenFinal.Scex.Scex;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author gpafu
 */
@Service
public class ScexServiceImp implements ScexService{
    @Autowired
    private ScexRepositorio repositorio;
    
    @Override
    public List<Scex> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Scex listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Scex agregar(Scex s){
        return repositorio.save(s);
    }
    
    @Override
    public Scex editar(Scex s){
        return repositorio.save(s); //verificar y poner un método válido
    }
    
    @Override
    public Scex eliminar(int id){
        
        return null;   
    }
}
