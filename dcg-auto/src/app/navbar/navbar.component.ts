import { Component, OnInit } from '@angular/core';
import {
  ReactiveFormsModule,
  FormsModule,
  FormGroup,
  FormControl,
  Validators,
  FormBuilder
} from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PaginatedInventoryListWrapper } from '../model/PaginatedInventoryListWrapper';




@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  public navSearchForm: FormGroup;
  public navBarSearchField: FormControl;
  
//  constructor(private route: ActivatedRoute) {}
    constructor (private router: Router) {}
  
  
  ngOnInit() {
    this.createFormControls();
    this.createForm();
  }

  createFormControls() {
    this.navBarSearchField = new FormControl();
  }

  createForm() {
    this.navSearchForm = new FormGroup({
      query: this.navBarSearchField
    });
  }


  onSubmit({ value }: { value: PaginatedInventoryListWrapper }) {
    console.log('Hey im submitting form');
    console.log(value.query);
    //    this.navSearchForm.reset();
    this.router.navigate(['/inventory/', value.query]);
  }

}
