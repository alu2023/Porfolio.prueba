import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HysoftComponent } from './hysoft.component';

describe('HysoftComponent', () => {
  let component: HysoftComponent;
  let fixture: ComponentFixture<HysoftComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HysoftComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HysoftComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
