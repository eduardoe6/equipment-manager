package br.edu.unisep.equipmentmanager.model.repository;

import br.edu.unisep.equipmentmanager.model.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

    @Query("select e from Equipment e where e.status = 1")
    List<Equipment> findAllAvailable();

}
