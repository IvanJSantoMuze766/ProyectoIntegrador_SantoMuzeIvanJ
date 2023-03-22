import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NombreProfesionComponent } from './nombre-profesion.component';

describe('NombreProfesionComponent', () => {
  let component: NombreProfesionComponent;
  let fixture: ComponentFixture<NombreProfesionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NombreProfesionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NombreProfesionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
