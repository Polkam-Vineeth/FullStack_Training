import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-compone',
  templateUrl: './compone.component.html',
  styleUrls: ['./compone.component.css']
})
export class ComponeComponent implements OnInit {

  comptitle:string ='vin';
  constructor() { }

  ngOnInit(): void {
  }

  showAlert(){
    alert("Hey SEXY!");
  }

}
