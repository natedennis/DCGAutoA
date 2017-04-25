import { Component } from '@angular/core';
import { InventoryService } from './service/inventory.service';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'Simple binding';
  myArr = ['him', 'hers', 'yours'];
  truckLogo = 'https://www.crookmotors.com/img/siteimages/garage.jpg';
  titleClass = 'red-title';
  titleClasses = {
    'red-title': true,
    'large-title': false
  };

  buttonStatus = false;

  makesProperty = '';
  makesProperties;


  constructor(private inventoryService: InventoryService) {

  }

  ngOnInit() {
//    console.log(this.inventoryService.makes);
    this.makesProperty = this.inventoryService.getData();
    this.makesProperties = this.inventoryService.makes;
  }

  buttonClickEvent(event) {
    console.log(event);
  }
}
