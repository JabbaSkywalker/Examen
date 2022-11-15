/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examenFinal;

import com.example.examenFinal.Login.LoginService;
import com.example.examenFinal.Login.Login;
import com.example.examenFinal.Scex.Scex;
import com.example.examenFinal.Scex.ScexService;
import com.example.examenFinal.Sipen.Sipen;
import com.example.examenFinal.Sipen.SipenService;
import com.example.examenFinal.Slafi.SlafiService;
import com.example.examenFinal.Slafi.Slafi;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gpafu
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/API")
//@Controller
public class ControladorCommand {
    
       
    @Autowired
    SlafiService slafi;
    
    @Autowired
    SipenService sipen;
    
    @Autowired
    ScexService scex; 
    
    @Autowired
    LoginService login;
    
        
    @RequestMapping("/slafi")
    @GetMapping
    public List<Slafi>listarSlafi(){
        return slafi.Listar();
    }
    
    /*@RequestMapping("/slafi")
    @PostMapping
    public Slafi agregarSlafi(@RequestBody Slafi s){
        return slafi.agregar(s);
    }
    
    @RequestMapping("/slafi")
    @GetMapping(path = {"/{id}"})
    public Slafi listarIdSlafi(int id){
    return slafi.listarId(id);
    }
    
    @RequestMapping("/slafi")
    @PutMapping(path = {"/{id}"})
    public Slafi editarSlafi(@RequestBody Slafi s,@PathVariable("id")int id){
        s.setId(id);
        return slafi.editar(s);
    }*/
    
    @RequestMapping("/sipen")
    @GetMapping
    public List<Sipen>listarSipen(){ 
        return sipen.Listar();
    }
    
    @RequestMapping("/scex")
    @GetMapping
    public List<Scex>listarScex(){ 
        return scex.Listar();
    }
    
    @RequestMapping("/login")
    @GetMapping
    public List<Login>listarUsuario(){
        return login.Listar();
    }
}
