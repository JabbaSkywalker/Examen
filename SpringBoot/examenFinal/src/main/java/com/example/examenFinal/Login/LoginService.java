/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Login;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gpafu
 */
@Service
public interface LoginService {
    List<Login>Listar();
    Login listarId(int id);
    Login agregar(Login l);
    Login editar(Login l);
    Login eliminar(int id);
}
