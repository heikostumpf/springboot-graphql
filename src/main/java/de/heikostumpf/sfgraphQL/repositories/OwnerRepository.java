package de.heikostumpf.sfgraphQL.repositories;

import de.heikostumpf.sfgraphQL.entities.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
