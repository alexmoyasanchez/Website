package edu.upc.dsa.models;

public class Repositorio {
    String username;
    String repository;
    String description;
    String followers;

    public Repositorio(){

    }

    public Repositorio(String username, String repository, String description, String followers){
        this.username = username;
        this.repository=repository;
        this.description=description;
        this.followers=followers;
    }
    public String getUsername(){return username;}

    public void setUsername(String username){this.username = username;}

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }


    @Override
    public String toString() {
        return "Repositorio{" +
                "repository='" + repository + '\'' +
                ", description='" + description + '\'' +
                ", followers='" + followers +
                '}';
    }

}
