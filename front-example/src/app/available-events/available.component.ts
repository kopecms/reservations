import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import CustomValidators from '../forms/CustomValidators';
import { AvailableService } from '../available-events/available.service';
import { ActivatedRoute } from '@angular/router';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-available',
  templateUrl: './available.component.html',
  styleUrls: ['./available-component.css']
})
export class AvailableComponent implements OnInit {
  eventForm: FormGroup;
  
  constructor(private formBuilder: FormBuilder, public available_events: AvailableService) {}

  ngOnInit() {
    this.eventForm = this.formBuilder.group({
      discount: ['', Validators.required],
      name: ['', [Validators.required, CustomValidators.validateEmail]],
      timetable: ['', Validators.required],
      seat: ['', Validators.required]
    });
  }

  post(postObject): Observable<any> {
    return this.available_events.postReservations(postObject);
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
