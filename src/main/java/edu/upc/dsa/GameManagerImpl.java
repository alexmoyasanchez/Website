package edu.upc.dsa;

import edu.upc.dsa.models.Repositorio;

import java.util.*;
import java.util.logging.Logger;


public class GameManagerImpl implements GameManager {

    public List<Repositorio> listaRepositorios = new LinkedList<>();

    private static GameManagerImpl implementation;
    static final Logger logger = Logger.getLogger(GameManagerImpl.class.getName());

    public static GameManagerImpl getInstance() {
        if (implementation == null) {
            implementation = new GameManagerImpl();
        }

        return implementation;
    }

    public static void delete() {
        implementation = null;
        logger.info("Instancia game manager borrada");

    }

    public GameManagerImpl() {

    }

    @Override
    public void addRepositorio(String username, String repository, String description, String followers) {
        Repositorio repositorio = new Repositorio(username, repository, description, followers);
        listaRepositorios.add(repositorio);
        logger.info("Repositorio añadido:" + username);
    }

    public List<Repositorio> getRepositorio(String username){
        List<Repositorio> r = new LinkedList<>();
        for (int i=0; i<listaRepositorios.size(); i++) {
            if(listaRepositorios.get(i).getUsername().equals(username)) {
                r.add(listaRepositorios.get(i));
            }
        }
        return r;
    }




}
