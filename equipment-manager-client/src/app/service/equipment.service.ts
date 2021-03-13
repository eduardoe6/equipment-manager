import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EquipmentDto } from '../model/dto';
import { WS_LIST_EQUIPMENT } from '../utils/ws.utils';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EquipmentService {

  constructor(private http: HttpClient) { }

  findAll(): Observable<EquipmentDto[]>{
    return this.http.get<EquipmentDto[]>(WS_LIST_EQUIPMENT)
  }
}
