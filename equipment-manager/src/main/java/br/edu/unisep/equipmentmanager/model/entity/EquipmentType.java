package br.edu.unisep.equipmentmanager.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="equipment_type")
public class EquipmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_type")
    private Integer id;

    @Column(name="type_name")
    private String name;

}
