import { Component, Input, OnChanges, OnInit, SimpleChange, SimpleChanges } from '@angular/core';
import { Router } from '@angular/router';
import { CurrencyService } from 'src/app/services/currency.service';
import { ProductService } from 'src/app/services/product.service';
import { ProductType } from 'src/types';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  providers:[ProductService]
})
export class ProductListComponent implements OnInit, OnChanges {

  // @Input() selectedCurrency!: string;
  selectedCurrency!: string;
  plist: ProductType[]=[];
//   plist: ProductType[] = [{
//     productId: 111,
//     productName: 'Allensolly Shirt',
//     productPrice: 1200.999,
//     productImage: '/assets/Tommy.jpg',
//     productStock: 3
//   },
//   {
//     productId: 112,
//     productName: 'Allensolly jeans',
//     productPrice: 1700.999,
//     productImage: '/assets/vin.png',
//     productStock: 0
//   },
//   {
//     productId: 113,
//     productName: 'Allensolly shoes',
//     productPrice: 179898.999,
//     productImage: '/assets/vin.png',
//     productStock: 10
//   }
// ];
  
  constructor(
    private currencyService : CurrencyService,
    private productService: ProductService, 
    private router : Router){} //Injecting the services in constructor

  ngOnChanges(changes : SimpleChanges): void{
    console.log('Changes', changes);
  }
  ngOnInit(): void {
    this.getData();
    this.getCode();
  }

  getData() {
    this.productService.getProducts().subscribe(
      (data) => {
        console.log('SUCCESS', data);
        this.plist=data as ProductType[];// new
      },
      (error) => {
        console.log('ERROR', error);
      }
    );
  }

  getCode() {
    this.currencyService.currencyObservable.subscribe((code) => {
      this.selectedCurrency = code;
    });
  }

  addItem(data: any){
    console.log("Added to cart!", data);
    this.router.navigate(['/cart']);
  }
}
