package br.edu.unisep.equipmentmanager.domain.usecase.reservation;

import br.edu.unisep.equipmentmanager.domain.dto.reservation.ReservationDto;
import br.edu.unisep.equipmentmanager.model.entity.Reservation;
import br.edu.unisep.equipmentmanager.model.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListReservationsByUserUseCase {

    private ReservationRepository repository;

    public List<ReservationDto> execute(Integer user) {
        var reservations = repository.findByUser_Id(user);

        return reservations.stream()
                .map(this::toReservationDto)
                    .collect(Collectors.toList());
    }

    private ReservationDto toReservationDto(Reservation reservation) {
        return ReservationDto.builder()
                .id(reservation.getId())
                .equipment(reservation.getEquipment().getName())
                .date(reservation.getDate())
                .period(reservation.getPeriod())
                .build();
    }

}
