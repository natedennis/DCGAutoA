import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgdbCarouselComponent } from './ngdb-carousel.component';

describe('NgdbCarouselComponent', () => {
  let component: NgdbCarouselComponent;
  let fixture: ComponentFixture<NgdbCarouselComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgdbCarouselComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgdbCarouselComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
