import { Injectable } from '@angular/core';
import { Headers, RequestOptions, Http, URLSearchParams, Response } from '@angular/http';
import 'rxjs/add/operator/map';
import {EventComponent} from './event.component';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/catch';

@Injectable()
export class EventService {
  constructor(private http: Http) {}

  getReservations(org: string) {
    return this.makeRequest(`reservations`);
  }

  postReservations(): Observable<any> {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    // let options = new RequestOptions({ headers: headers });
    let url = `http://localhost:8080/api/events/create/`
    console.log("chuj");
    var test = {name: "Albert", organizer: "Hawrylak", timetable: 5004};
    console.log(JSON.stringify(test));
    return this.http
      .post(url, test, {headers: headers}).subscribe();
      // .map(res => res.json())
      // .catch(this.handleError);
  }

  private makeRequest(path: string) {
    let url = `http://localhost:8080/api/reservations`;
    console.log("CHUJ");
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
