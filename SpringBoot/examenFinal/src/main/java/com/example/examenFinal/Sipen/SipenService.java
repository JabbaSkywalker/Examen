/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.examenFinal.Sipen;

import com.example.examenFinal.Sipen.Sipen;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 *
 * @author gpafu
 */
@Service
public interface SipenService {
    List<Sipen>Listar();
    Sipen listarId(int id);
    Sipen agregar(Sipen s);
    Sipen editar(Sipen s);
    Sipen eliminar(int id);
}
