import { Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { EventComponent } from './event/event.component'
import { ReservationComponent } from './reservation/reservation.component'
import { AvailableComponent } from './available-events/available.component'

export const rootRouterConfig: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  {
    path: 'reservation', component: ReservationComponent
  },
  {
    path: 'available_events', component: AvailableComponent
  },
  {
    path: 'event', component: EventComponent 
  }
];

