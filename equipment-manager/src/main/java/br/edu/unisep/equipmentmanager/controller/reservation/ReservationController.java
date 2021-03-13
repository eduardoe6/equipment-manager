package br.edu.unisep.equipmentmanager.controller.reservation;

import br.edu.unisep.equipmentmanager.domain.dto.reservation.NewReservationDto;
import br.edu.unisep.equipmentmanager.domain.dto.reservation.ReservationDto;
import br.edu.unisep.equipmentmanager.domain.usecase.reservation.ListReservationsByUserUseCase;
import br.edu.unisep.equipmentmanager.domain.usecase.reservation.NewReservationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private ListReservationsByUserUseCase listReservationsByUserUseCase;
    private NewReservationUseCase newReservationUseCase;


    @GetMapping("/{user}")
    public List<ReservationDto> listByUser(@PathVariable("user") Integer user) {
        return listReservationsByUserUseCase.execute(user);
    }

    @PostMapping
    public void save(@RequestBody NewReservationDto newReservation) {
        newReservationUseCase.execute(newReservation);
    }

}
