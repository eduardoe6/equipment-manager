package br.edu.unisep.equipmentmanager.model.repository;

import br.edu.unisep.equipmentmanager.model.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findByUser_Id(Integer user);

}
