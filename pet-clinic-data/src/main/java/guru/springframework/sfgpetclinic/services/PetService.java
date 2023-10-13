package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService {

    public Pet findById(Long id);

    public Pet save(Pet pet);

    public Set<Pet> findAll();

}
