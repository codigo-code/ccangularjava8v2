import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DescripcionPersonaComponent } from './descripcion-persona.component';

describe('DescripcionPersonaComponent', () => {
  let component: DescripcionPersonaComponent;
  let fixture: ComponentFixture<DescripcionPersonaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DescripcionPersonaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DescripcionPersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
