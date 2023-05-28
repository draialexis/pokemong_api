package fr.uca.iut.controllers;

import fr.uca.iut.entities.Pokemong;
import fr.uca.iut.services.PokemongService;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pokemong")
@Produces(MediaType.APPLICATION_JSON)
public class PokemongController extends GenericController<Pokemong> {

    @Inject
    PokemongService pokemongService;

    @PostConstruct
    public void init() {
        setService(pokemongService);
    }
}
