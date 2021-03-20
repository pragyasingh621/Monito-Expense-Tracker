import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadExpensesComponent } from './upload-expenses.component';

describe('UploadExpensesComponent', () => {
  let component: UploadExpensesComponent;
  let fixture: ComponentFixture<UploadExpensesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UploadExpensesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UploadExpensesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
