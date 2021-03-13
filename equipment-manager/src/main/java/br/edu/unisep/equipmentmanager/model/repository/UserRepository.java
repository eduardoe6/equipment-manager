package br.edu.unisep.equipmentmanager.model.repository;


import br.edu.unisep.equipmentmanager.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);

}
