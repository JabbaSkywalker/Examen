/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Login;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author gpafu
 */
public interface LoginRepositorio extends Repository<Login, Integer>{
    List<Login>findAll();
    Login findById(int id);
    Login save(Login l);
    void delete(Login l);
}
