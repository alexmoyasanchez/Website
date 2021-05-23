package edu.upc.dsa.services;
import edu.upc.dsa.models.Repositorio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import edu.upc.dsa.GameManagerImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;

@Api(value = "/buscar", description = "no")
@Path("")
public class JSONService {

    private final GameManagerImpl gm = new GameManagerImpl();

    public JSONService() {
        this.gm.addRepositorio("Alex","Calculadora", "Calculadora Android", "1");
        this.gm.addRepositorio("Alex", "Unity", "Tutorial Roguelike Unity", "2" );

    }

    @POST
    @ApiOperation(
            value = "(1) get repositorios",
            notes = "asdasd"
    )
    @ApiResponses({@ApiResponse(
            code = 201,
            message = "Successful",
            response = Repositorio.class,
            responseContainer = "List"
    )})
    @Path("/buscar/buscarInfo")
    @Produces({"application/json"})
    public Response getRepositorio(String user) {

        List<Repositorio> repositorios = gm.getRepositorio(user);
        GenericEntity<List<Repositorio>> entity = new GenericEntity<List<Repositorio>>(repositorios) {};
        return Response.status(201).entity(entity).build();
    }

}