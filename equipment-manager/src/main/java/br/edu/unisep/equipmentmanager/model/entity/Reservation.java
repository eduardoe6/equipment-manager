package br.edu.unisep.equipmentmanager.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="reservation")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_reservation")
    private Integer id;

    @Column(name="reservation_date")
    private LocalDate date;

    @Column(name="period")
    private Integer period;

    @OneToOne
    @JoinColumn(name="id_equipment")
    private Equipment equipment;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
