package de.heikostumpf.sfgraphQL.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import de.heikostumpf.sfgraphQL.entities.Owner;
import de.heikostumpf.sfgraphQL.entities.Pet;
import de.heikostumpf.sfgraphQL.enums.Animal;
import de.heikostumpf.sfgraphQL.repositories.OwnerRepository;
import de.heikostumpf.sfgraphQL.repositories.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    public Pet newPet(String name, Animal type, int age) {
        Pet pet = new Pet();
        pet.setName(name);
        pet.setType(type);
        pet.setAge(age);

        petRepository.save(pet);
        return pet;
    }

    public Owner newOwner(String firstname, String lastname, int age) {
        Owner owner = new Owner();
        owner.setFirstname(firstname);
        owner.setLastname(lastname);
        owner.setAge(age);

        return ownerRepository.save(owner);
    }
}
