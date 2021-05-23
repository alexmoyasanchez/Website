package edu.upc.dsa;

import edu.upc.dsa.models.Repositorio;

import java.util.HashMap;
import java.util.List;

public interface GameManager {


    public void addRepositorio(String username, String repository, String description, String followers);
    public List<Repositorio> getRepositorio(String username);


}
