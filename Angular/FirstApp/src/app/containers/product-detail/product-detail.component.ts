import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from 'src/app/services/product.service';
import { ProductType } from 'src/types';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
  providers:[ProductService]
})
export class ProductDetailComponent implements OnInit {

  selectedCurrency!: string;
  
  plist: ProductType[]=[];

  constructor(
    private activeRoute : ActivatedRoute,
    private productService: ProductService, 
    private router : Router){}

  

  ngOnInit(): void {
   
    this.getData();
    // path params : /detail/100
    this.activeRoute.paramMap.subscribe((params) => {
      console.log('PID', params.get('pid'));
    });

    // query params : /detail/1000?rating=4&pincode=123456
    this.activeRoute.queryParamMap.subscribe((params) => {
      console.log('RATING', params.get('rating'));
      console.log('PINCODE', params.get('pincode'));
    });

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

  addItem(data: any){
    console.log("Added to cart!", data);
    this.router.navigate(['/cart']);
  }

}
