
package com.mycompany.superheroesjpa.interfaces;

import com.mycompany.superheroesjpa.entity.SuperHeroe;
import java.util.List;

/**
 *
 * @author claudia sheinbaum
 */
public interface ISuperHeroeDAO {
    void insertar(SuperHeroe e);
    void actualizar(SuperHeroe e);
    void eliminar(Long id);
    SuperHeroe buscar(Long id);
    List<SuperHeroe> listar();
}
