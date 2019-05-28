package de.heikostumpf.sfgraphQL.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import de.heikostumpf.sfgraphQL.entities.Owner;
import de.heikostumpf.sfgraphQL.entities.Pet;
import de.heikostumpf.sfgraphQL.repositories.OwnerRepository;
import de.heikostumpf.sfgraphQL.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PetRepository petRepository;

    private final OwnerRepository ownerRepository;

    public Iterable<Pet> pets() {
        return petRepository.findAll();
    }

    public Iterable<Pet> getPetsById(long id) {
        System.out.println("Incoming ID: " + id);
        List<Long> ids = new ArrayList<Long>();
        ids.add(id);
        return petRepository.findAllById(ids);
    }

    public Iterable<Owner> owners() {
        return ownerRepository.findAll();
    }
}
