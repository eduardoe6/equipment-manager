package br.edu.unisep.equipmentmanager.domain.dto.reservation;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewReservationDto {

    private Integer equipment;

    private Integer user;

    private LocalDate date;

    private Integer period;

}
