import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserComponent } from './user.component';

describe('UserComponent', () => {
  let component: UserComponent;
  let fixture: ComponentFixture<UserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [UserComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('la variable nombre debe decir tomas', () => {
    expect(component.nombre).toEqual('tomas');
  });

  it('el password debe tener 8 caracteres', () => {
    component.validarForm();
    expect(component.password.toString().length).toBe(8);
  });

  it('solo funciona con un input !!!! --> validamos el campo password que este populado', () => {
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector(`input[name='password']`).value).toContain('**');
  });


});
