package com.mycompany.superheroesjpa;

import com.mycompany.superheroesjpa.dao.SuperHeroeDAO;
import com.mycompany.superheroesjpa.entity.IdentidadSecreta;
import com.mycompany.superheroesjpa.entity.SuperHeroe;
import com.mycompany.superheroesjpa.entity.Universo;
import com.mycompany.superheroesjpa.interfaces.ISuperHeroeDAO;

/**
 *
 * @author Laboratorios
 */
public class JPASuperHeroe {

    public static void main(String[] args) {
        ISuperHeroeDAO dao = new SuperHeroeDAO();
        
        SuperHeroe spiderman = new SuperHeroe("SpiderMan", Universo.MARVEL, new IdentidadSecreta("Peter Parker", "New York", "Fotografo"), "Con Gran Poder Viene Una Gran Responsabilidad");
        SuperHeroe batman = new SuperHeroe("Batman", Universo.DC , new IdentidadSecreta("Bruce Wayne", "Gotham", "Empresario"), "Soy La Venganza");
        SuperHeroe goku = new SuperHeroe("Goku", Universo.INDEPENDIENTE, new IdentidadSecreta("Kakarotto", "Planeta Tierra", "Guerrero"), "!Kamegameha¡");
        
        dao.insertar(spiderman);
        dao.insertar(batman);
        dao.insertar(goku);
        
        System.out.println("Lista Inicial De SuperHeroes");
        dao.listar().forEach(h -> {
            System.out.println(h);
        });
        
        SuperHeroe batmanDB = dao.buscar(batman.getId());
        batmanDB.getIdentidadSecreta().setCiudad("Ciudad Gotica");
        dao.actualizar(batmanDB);
        
        System.out.println("Lista Despues De Modificar A Batman");
        dao.listar().forEach(h -> {
            System.out.println(h);
        });
        
        
        dao.eliminar(spiderman.getId());
        
        System.out.println("Lista Despues De Eliminar A Spiderman");
        dao.listar().forEach(h -> {
            System.out.println(h);
        });        
    }
}
