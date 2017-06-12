import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import CustomValidators from '../forms/CustomValidators';
import { ReservationService } from '../reservation/reservation.service'
import { ActivatedRoute } from '@angular/router';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation-component.css']
})
export class ReservationComponent implements OnInit {
  eventForm: FormGroup;
  
  constructor(private formBuilder: FormBuilder, public reservation: ReservationService) {}

  ngOnInit() {
    this.eventForm = this.formBuilder.group({
      discount: ['', Validators.required],
      name: ['', [Validators.required, CustomValidators.validateEmail]],
      timetable: ['', Validators.required],
      seat: ['', Validators.required]
    });
  }

  post(postObject): Observable<any> {
    return this.reservation.postReservations(postObject);
  }

  submitForm(): void {
    // console.log(this.eventForm);
    this.post(this.eventForm.value).subscribe(
      Response => {
        console.log(Response);
      }
    );
  }
}
