import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FirstApp';
  allowedLength =6;
  currentCurrency: string = 'INR';
  setCurrency(code: string) {
    this.currentCurrency = code;
  }
}
