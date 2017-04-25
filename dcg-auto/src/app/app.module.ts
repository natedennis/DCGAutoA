import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule, Routes } from '@angular/router';

import { JsonpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { InventoryService } from './service/inventory.service';
import { InventoryComponent } from './inventory-component/inventory.component';
import { NgdbCarouselComponent } from './ngdb-carousel/ngdb-carousel.component';
import { NavbarComponent } from './navbar/navbar.component';

const appRoutes: Routes = [
//  { path: 'forms', component: ExampleFormComponent },
//  { path: '', component: HomeComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    InventoryComponent,
    NgdbCarouselComponent,
    NavbarComponent],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    JsonpModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(appRoutes)],
  providers: [InventoryService],
  bootstrap: [AppComponent]
})
export class AppModule { }
