import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormdatacollectComponent } from './formdatacollect.component';

describe('FormdatacollectComponent', () => {
  let component: FormdatacollectComponent;
  let fixture: ComponentFixture<FormdatacollectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormdatacollectComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormdatacollectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
