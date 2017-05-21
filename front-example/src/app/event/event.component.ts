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

  // org: string;
  // repos: Observable<any>;


  // constructor(public event: EventService, private route: ActivatedRoute) {}

  // ngOnInit() {
  //   this.route.params.subscribe(params => {
  //     // this.org = params['org'];
  //     // if (this.org) {
  //       this.repos = this.event.getReservations(this.org);
  //     // }
  //   });
  // }
  
  ngOnInit() {
    this.eventForm = this.formBuilder.group({
      name: ['', Validators.required],
      organizer: ['', [Validators.required, CustomValidators.validateEmail]],
      id: ['', Validators.required]
    });
  }
  submitForm(): void {
    this.event.postReservations(this.eventForm.value);
    console.log(this.eventForm);
  }
}
