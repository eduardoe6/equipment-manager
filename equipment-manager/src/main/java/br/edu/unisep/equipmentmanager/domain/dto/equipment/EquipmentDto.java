package br.edu.unisep.equipmentmanager.domain.dto.equipment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDto {

    private Integer id;

    private String name;

    private String type;

}
