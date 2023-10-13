package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Pet findById();

    Pet save(Vet vet);

    Set<Pet> findAll();

}
