import { Inventory } from '../model/inventory';

export class PaginatedInventoryListWrapper {
  currentPage: number;
  pageSize: number;
  totalResults: number;
  sortFields: string;
  sortDirection: string;
  list: Inventory[];
}
