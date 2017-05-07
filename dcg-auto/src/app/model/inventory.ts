import { Make } from '../model/make';

export class Inventory {
  id: number;
  stockNumber: string;
  year: string;
  catagoryLineId: number;
  make: Make;
  title: string;
  price: number;
  descript: string;
  newused: boolean;
  dateListed: string;
  dateDeleted: string;
  createDate: string;
  isActive: boolean;
  fileList: string;
  social: boolean;
}
