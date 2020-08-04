package org.forge.jdbc;

import org.forge.jdbc.dao.PeliculaDAO;

import java.sql.SQLException;
import java.util.Map;

public class CuentaActores {
    public static void main(String[] args) throws SQLException {
        Map<String, Integer> res = new PeliculaDAO().contarActoresPorPelicula();
        for (String pelicula : res.keySet()) {
            System.out.println(pelicula + ": "+res.get(pelicula));
        }
    }
}
