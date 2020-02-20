import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthorsListComponentComponent } from './authors-list-component.component';

describe('AuthorsListComponentComponent', () => {
  let component: AuthorsListComponentComponent;
  let fixture: ComponentFixture<AuthorsListComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AuthorsListComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AuthorsListComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
