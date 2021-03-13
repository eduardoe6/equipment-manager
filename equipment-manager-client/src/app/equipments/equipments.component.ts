import { Component, OnInit } from '@angular/core';
import { EquipmentService } from '../service/equipment.service';

@Component({
  selector: 'app-equipments',
  templateUrl: './equipments.component.html',
  styleUrls: ['./equipments.component.css']
})
export class EquipmentsComponent implements OnInit {

  equipments = []

  constructor(private equipmentService: EquipmentService) { }

  ngOnInit() {
    this.listEquipments()
  }

  private listEquipments() {
    let result = this.equipmentService.findAll();

    result.subscribe(listEquip => {
      this.equipments = listEquip
    })
  }

}
