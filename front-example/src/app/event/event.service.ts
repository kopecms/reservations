import { Injectable } from '@angular/core';
import { Http, URLSearchParams } from '@angular/http';
import 'rxjs/add/operator/map';
import {EventComponent} from './event.component'

@Injectable()
export class EventService {
  constructor(private http: Http) {}

  getReservations(org: string) {
    return this.makeRequest(`reservations`);
  }

  postReservations(eventComponent: EventComponent) {

    let url = `http://localhost:8080/api/events/create`
    return this.http
      .post(url, JSON.stringify(eventComponent.eventForm));
  }

  private makeRequest(path: string) {
    let url = `http://localhost:8080/api/reservations`;
    console.log("CHUJ");
    return this.http.get(url)
      .map((res) => res.json());
  }
}
