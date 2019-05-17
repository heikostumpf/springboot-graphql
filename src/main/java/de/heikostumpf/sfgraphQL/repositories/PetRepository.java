package de.heikostumpf.sfgraphQL.repositories;

import de.heikostumpf.sfgraphQL.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {}
