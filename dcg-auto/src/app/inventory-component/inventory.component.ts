import { Component, OnInit } from '@angular/core';
import { InventoryService } from '../service/inventory.service';
import { Inventory } from '../model/inventory';
import { PaginatedInventoryListWrapper } from '../model/PaginatedInventoryListWrapper';




@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {
  plr: PaginatedInventoryListWrapper;
  inventoryList: Inventory[];
  selectedInventory: Inventory;
  currentPage = 0;
  pageSize = 100;
  totalResults = 0;
  sortFields = '';
  sortDirections = '';
  inventoryItem:Inventory;



  constructor(private inventoryService: InventoryService) { }

  getInventory(): void {
    //    this.inventoryService.getAllInventory().then(inventoryList => this.inventoryList = inventoryList);
    this.inventoryService.getAllInventory().then( res => {this.plr = res as PaginatedInventoryListWrapper;
//      console.log(this.plr);
      this.inventoryList = this.plr.list as Inventory[] ;
      this.currentPage = this.plr.currentPage;
      this.pageSize = this.plr.pageSize;
      this.totalResults = this.plr.totalResults;
      this.sortFields = this.plr.sortFields;
      this.sortDirections = this.plr.sortDirection;
//      console.log(this.inventoryList);
    });

//    console.log(this.plr);
  }

  ngOnInit() {
//    console.log('test inventory');
    this.getInventory();


  }
  generateArray(obj) {
    return Object.keys(obj).map((key) => { return obj[key]; });
  }
  onSelect(inventoryItem: Inventory) {
    this.selectedInventory = inventoryItem;
    this.inventoryService.getInventory(this.selectedInventory.id).then(res => {
      this.inventoryItem = res as Inventory;
      console.log(res);
     }
    );

  }

}
