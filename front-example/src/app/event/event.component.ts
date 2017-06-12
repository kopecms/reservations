import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import CustomValidators from '../forms/CustomValidators';
import { EventService } from '../event/event.service'
import { ActivatedRoute } from '@angular/router';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event-component.css']
})
export class EventComponent implements OnInit {
  eventForm: FormGroup;
  constructor(private formBuilder: FormBuilder, public event: EventService) {}

  ngOnInit() {
    this.eventForm = this.formBuilder.group({
      name: ['', Validators.required],
      organizer: ['', [Validators.required, CustomValidators.validateEmail]],
      timetable: ['', Validators.required],
      numberOfSeats: ['', Validators.required],
      ticketPrice: ['', Validators.required],
      address: ['', Validators.required],
      room: ['', Validators.required],
      description: ['', Validators.required]
    });
  }

  post(postObject): Observable<any> {
    return this.event.postReservations(postObject);
  }

  submitForm(): void {
    this.post(this.eventForm.value).subscribe(
      Response => {
        console.log(Response);
      }
    );
  }
}
