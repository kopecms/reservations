import { Injectable } from '@angular/core';
import { Headers, RequestOptions, Http, URLSearchParams, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import { ReservationComponent } from './reservation.component';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/catch';

@Injectable()
export class ReservationService {
  constructor(private http: Http) {}

  getReservations(org: string) {
    return this.makeRequest(`reservations`);
  }

  postReservations(postObject) {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let url = `http://localhost:8080/api/events/create/`
    postObject.timetable = parseInt(postObject.timetable);
    postObject.seat = parseInt(postObject.seat);
    return this.http
      .post(url, JSON.stringify(postObject), {headers: headers})
      .map((res:Response) => res.json());
  }

  private makeRequest(path: string) {
    let url = `http://localhost:8080/api/reservations`;
    return this.http.get(url)
      .map((res) => res.json());
  }

  private handleError (error: Response | any) {
    // In a real world app, you might use a remote logging infrastructure
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }
}
