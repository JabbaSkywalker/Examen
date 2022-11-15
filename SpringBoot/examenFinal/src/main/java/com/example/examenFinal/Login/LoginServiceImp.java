/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examenFinal.Login;

import com.example.examenFinal.Login.LoginService;
import com.example.examenFinal.Login.LoginRepositorio;
import com.example.examenFinal.Login.Login;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author gpafu
 */
@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private LoginRepositorio repositorio;
    
    @Override
    public List<Login> Listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Login listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Login agregar(Login l){
        return repositorio.save(l);
    }
    
    @Override
    public Login editar(Login l){
        return repositorio.save(l); //verificar y poner un método válido
    }
    
    @Override
    public Login eliminar(int id){
        
        return null;   
    }
}
