package de.heikostumpf.sfgraphQL.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import de.heikostumpf.sfgraphQL.entities.Pet;
import de.heikostumpf.sfgraphQL.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PetRepository petRepository;

    public Iterable<Pet> pets() {
        return petRepository.findAll();
    }
}
