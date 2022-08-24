import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { ProductType } from 'src/types';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  @Input() data!: ProductType;
  @Output() btnClick = new EventEmitter;
  @Input() currencyCode = "USD";
  
  constructor() { }
  
  ngOnInit(): void {
  }

  notifyParent(){
    this.btnClick.emit( {name: this.data.productName, id: this.data.productId});
  }
}
