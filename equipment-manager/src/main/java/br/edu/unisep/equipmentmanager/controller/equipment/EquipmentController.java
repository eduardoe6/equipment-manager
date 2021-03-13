package br.edu.unisep.equipmentmanager.controller.equipment;

import br.edu.unisep.equipmentmanager.domain.dto.equipment.EquipmentDto;
import br.edu.unisep.equipmentmanager.domain.usecase.equipment.ListAvailableEquipmentUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    private ListAvailableEquipmentUseCase listAvailableUseCase;

    @GetMapping
    public List<EquipmentDto> listAllAvailable() {
        return listAvailableUseCase.execute();
    }

}
