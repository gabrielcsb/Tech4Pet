package br.com.tech4me.tech4petshop.petshop.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4petshop.petshop.model.Pet;

public interface PetService {
    List<Pet> obterTodosOsPet();
    Optional<Pet> obterPetPorId(String id);
    void excluirPetPorId(String id);
    Pet cadastrarPet(Pet pet);
    Optional<Pet> atualizarPetPorId(String id, Pet pet);
    
}
