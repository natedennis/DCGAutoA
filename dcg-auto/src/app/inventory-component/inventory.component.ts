import { Component, OnInit } from '@angular/core';
import { InventoryService } from '../service/inventory.service';
import { Inventory } from '../model/inventory';
import { PaginatedInventoryListWrapper } from '../model/PaginatedInventoryListWrapper';
import { InfiniteScrollModule } from 'ngx-infinite-scroll';
import { Router, ActivatedRoute, Params } from '@angular/router';
import 'rxjs/add/operator/switchMap';





@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent implements OnInit {
  selectedInv: any;
  plr: PaginatedInventoryListWrapper;
//  inventoryList: Inventory[];
  inventoryList = new Array<Inventory>();
  selectedInventory: Inventory;
  currentPage = 1;
  pageSize = 100;
  totalResults = 0;
  sortFields = '';
  sortDirections = '';
  query = '';
  inventoryItem: Inventory;
  truckLogo = 'https://www.crookmotors.com/img/siteimages/garage.jpg';

  sum = 100;
  throttle = 300;
  scrollDistance = 2;

  constructor(
    private inventoryService: InventoryService,
    private router: Router,
    private route: ActivatedRoute, ) { }



  ngOnInit() {
    //    this.route.params
    //      .switchMap((params: Params) => this.getInventory(params['query']))
    //      .subscribe((plr: PaginatedInventoryListWrapper) => this.plr = plr);
    this.query = this.route.snapshot.params['query'];
    console.log(this.query);
    this.addItems(this.currentPage, this.pageSize, this.query);
  }

  getInventory(query: string): void {
    console.log('getInventory: ' + query);


    this.inventoryService.getAllInventory(query).then(res => {
      this.plr = res as PaginatedInventoryListWrapper;
      //      console.log(this.plr);
      this.inventoryList = this.plr.list as Inventory[];
      this.currentPage = this.plr.currentPage;
      this.pageSize = this.plr.pageSize;
      this.totalResults = this.plr.totalResults;
      this.sortFields = this.plr.sortFields;
      this.sortDirections = this.plr.sortDirection;
      //      this.query = this.plr.query;
      console.log(this.inventoryList);
    });

    console.log(this.plr);
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

  addItems(startIndex, pageSize, query) {
    this.inventoryService.getInventoryPage(startIndex, pageSize, query).then(res => {
      this.plr = res as PaginatedInventoryListWrapper;
      //      this.inventoryList = this.plr.list as Inventory[];
      this.currentPage = startIndex;
      this.pageSize = pageSize;
      this.totalResults = this.plr.totalResults;
      this.sortFields = this.plr.sortFields;
      this.sortDirections = this.plr.sortDirection;
      console.log(this.plr.list);
      for (let i = 0; i < this.plr.list.length; ++i) {
        this.inventoryList.push(this.plr.list[i]);
      }

    });
  }

  onScrollDown() {
    console.log('scrolled!!');
    ++this.currentPage;
    this.addItems(this.currentPage, this.pageSize, this.query);
  }


}
