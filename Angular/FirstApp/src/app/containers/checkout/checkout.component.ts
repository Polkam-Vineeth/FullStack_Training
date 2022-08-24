import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css'],
  providers:[ProductService]
})
export class CheckoutComponent implements OnInit {

  EMAIL_REGEX =
    /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

  checkoutForm = new FormGroup({
    name: new FormControl(null, [Validators.required, Validators.minLength(4)]),
    email: new FormControl('vin@dbs.com', [Validators.required, Validators.pattern(this.EMAIL_REGEX)]),
    pincode: new FormControl(null, [Validators.required, this.zipcodeValidator()])
  });
  
  constructor(private productService: ProductService) { } //Injecting the service in constructor

  ngOnInit(): void {}
  
  zipcodeValidator(){
    return (control: FormControl)=>{
      if(control.value ==12345){
        return null;
      }
      return {
        zipcode : {
          allowedCode: 12345,
          enteredCode: control.value
        }
      }
    }
  }
 
  submitData() {
    if (this.checkoutForm.valid) {
      console.log('form submission logic here');
      this.productService.doCheckout(this.checkoutForm.value).subscribe(
        (data) => {
          console.log('SUCCESS C', data);
        },
        (error) => {
          console.log('ERROR C', error);
        }
      );
    } else {
      console.log('form validation messages');
    }
  }

  loadData() {
    const data: any = {
      name: 'qwerty',
      email: 'mail@xyz.com',
      pincode: '123456',
    };
    this.checkoutForm.setValue(data);
  }

  patchData() {
    const data: any = {
      name: 'test',
      email: 'test@xyz.com',
      pincode: '500001'
    };
    this.checkoutForm.patchValue(data); // partial data
  }

}
