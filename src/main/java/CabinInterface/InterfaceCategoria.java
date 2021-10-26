/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CabinInterface;

import CabinModelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author cesartbossa
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
