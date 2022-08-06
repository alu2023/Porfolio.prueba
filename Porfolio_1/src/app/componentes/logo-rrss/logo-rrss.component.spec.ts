import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoRrssComponent } from './logo-rrss.component';

describe('LogoRrssComponent', () => {
  let component: LogoRrssComponent;
  let fixture: ComponentFixture<LogoRrssComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogoRrssComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogoRrssComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
