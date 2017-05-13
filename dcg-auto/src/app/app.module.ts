import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule, Routes } from '@angular/router';
import { InfiniteScrollModule } from 'ngx-infinite-scroll';

import { JsonpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { AppRoutingModule, routing, appRoutingProviders } from './app-routing.module';
import { InventoryService } from './service/inventory.service';
import { InventoryComponent } from './inventory-component/inventory.component';
import { NgdbCarouselComponent } from './ngdb-carousel/ngdb-carousel.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    JsonpModule,
    InfiniteScrollModule,
    NgbModule.forRoot()
  ],
  declarations: [
    AppComponent,
    routing,
    InventoryComponent,
    NgdbCarouselComponent,
    NavbarComponent,
    HomeComponent],
  providers: [
    InventoryService,
    appRoutingProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
