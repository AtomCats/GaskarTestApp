import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePublisherFormComponent } from './create-publisher-form.component';

describe('CreatePublisherFormComponent', () => {
  let component: CreatePublisherFormComponent;
  let fixture: ComponentFixture<CreatePublisherFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatePublisherFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatePublisherFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
