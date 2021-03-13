package br.edu.unisep.equipmentmanager.domain.usecase.equipment;

import br.edu.unisep.equipmentmanager.domain.dto.equipment.EquipmentDto;
import br.edu.unisep.equipmentmanager.model.entity.Equipment;
import br.edu.unisep.equipmentmanager.model.repository.EquipmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListAvailableEquipmentUseCase {

    private EquipmentRepository repository;

    public List<EquipmentDto> execute() {
        var equipments = repository.findAllAvailable();
        return equipments.stream().map(this::buildEquipmentDto)
                .collect(Collectors.toList());
    }

    private EquipmentDto buildEquipmentDto(Equipment equipment) {
        return EquipmentDto.builder()
                .id(equipment.getId())
                .name(equipment.getName())
                .type(equipment.getType().getName()).build();
    }

}
