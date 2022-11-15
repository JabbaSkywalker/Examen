/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.examenFinal.Slafi;

import com.example.examenFinal.Slafi.Slafi;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author gpafu
 */
@Service
public interface SlafiService {
    
    List<Slafi>Listar();
    Slafi listarId(int id);
    Slafi agregar(Slafi s);
    Slafi editar(Slafi s);
    Slafi eliminar(int id);
    
}
