import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CurrencyComponent } from './components/currency/currency.component';
import { ErrorPageComponent } from './components/error-page/error-page.component';
import { CheckoutComponent } from './containers/checkout/checkout.component';
import { ProductDetailComponent } from './containers/product-detail/product-detail.component';
import { ProductListComponent } from './containers/product-list/product-list.component';
import { AuthGuard } from './services/auth.guard';

const routes: Routes = [
  // home page : abc.com
  { path: '', component: CurrencyComponent },
  // products page : abc.com/products
  { path: 'products', component: ProductListComponent },
  // checkout page : abc.com/checkout
  { path: 'checkout', component: CheckoutComponent, canActivate: [AuthGuard] },
  { path: 'details/:pid', component: ProductDetailComponent },
  { path: '**', component: ErrorPageComponent },//always should be at the end
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
