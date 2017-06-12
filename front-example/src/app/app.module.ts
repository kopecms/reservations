import { NgModule } from '@angular/core'
import { RouterModule } from '@angular/router';
import { rootRouterConfig } from './app.routes';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import { EventService } from './event/event.service'
import { ReservationService } from './reservation/reservation.service'
import { AvailableService } from './available-events/available.service'

import { HomeComponent } from './home/home.component';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';
import { EventComponent } from './event/event.component'
import { ReservationComponent } from './reservation/reservation.component'
import { AvailableComponent } from './available-events/available.component'

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EventComponent,
    ReservationComponent,
    AvailableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    RouterModule.forRoot(rootRouterConfig, { useHash: true })
  ],
  providers: [
    EventService,
    ReservationService,
    AvailableService
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule {

}
