package br.edu.unisep.equipmentmanager.domain.usecase.reservation;

import br.edu.unisep.equipmentmanager.domain.dto.reservation.NewReservationDto;
import br.edu.unisep.equipmentmanager.model.entity.Equipment;
import br.edu.unisep.equipmentmanager.model.entity.Reservation;
import br.edu.unisep.equipmentmanager.model.entity.User;
import br.edu.unisep.equipmentmanager.model.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewReservationUseCase {

    private ReservationRepository repository;

    public void execute(NewReservationDto newReservation) {
        var reservation = toReservation(newReservation);
        repository.save(reservation);
    }

    private Reservation toReservation(NewReservationDto newReservation) {
        var equipment = Equipment.builder()
                .id(newReservation.getEquipment()).build();

        var user = User.builder().id(
                newReservation.getUser()).build();

        return Reservation.builder()
                .date(newReservation.getDate())
                .equipment(equipment)
                .period(newReservation.getPeriod())
                .user(user)
                .build();
    }

}
