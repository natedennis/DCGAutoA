import { Injectable } from '@angular/core';
import { Headers, Http, URLSearchParams } from '@angular/http';
import { Inventory } from '../model/inventory';
import { PaginatedInventoryListWrapper } from '../model/PaginatedInventoryListWrapper';


import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';


@Injectable()
export class InventoryService {
  makes = ['Ford', 'Chevrolet', 'Buick'];
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private inventoryUrl = 'http://localhost:8080/dcg-auto-jee/resources/inventory';  // URL to web api

  constructor(private http: Http) { }

  getAllInventory(query: string): Promise<PaginatedInventoryListWrapper> {
    console.log('getAllInventory');
    let url = this.inventoryUrl;

    if (query != null && query.length > 0) {
      url = url + '&query=' + query;
    }
    console.log('url: ' + url);

    return this.http.get(this.inventoryUrl)
      .toPromise()
      .then(response => response.json() as PaginatedInventoryListWrapper)
      .catch(this.handleError);
  }


  getInventoryPage(page, maxResults, query: string): Promise<PaginatedInventoryListWrapper> {
    console.log('getAllInventory');
    let url = this.inventoryUrl + '?page=' + page + '&pageSize=' + maxResults;

    if (query != null && query.length > 0) {
      url = url + '&query=' + query;
    }
    console.log('url: ' + url);

    return this.http.get(url)
      .toPromise()
      .then(response => response.json() as PaginatedInventoryListWrapper)
      .catch(this.handleError);
  }


  getInventory(id: number): Promise<Inventory> {
    const url = `${this.inventoryUrl}/${id}`;
    return this.http.get(url)
      .toPromise()
      .then(response => response.json() as Inventory)
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

  getData() {
    return 'this is my data';
  }

}
