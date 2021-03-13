package br.edu.unisep.equipmentmanager.domain.dto.reservation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private Integer id;

    private String equipment;

    private LocalDate date;

    private Integer period;

}
