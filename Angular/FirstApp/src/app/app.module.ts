import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponeComponent } from './compone/compone.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductComponent } from './components/product/product.component';
import { ProductListComponent } from './containers/product-list/product-list.component';
import { ConversionPipe } from './pipes/conversion.pipe';
import { CurrencyComponent } from './components/currency/currency.component';
import { CheckoutComponent } from './containers/checkout/checkout.component';
import { NumbersOnlyDirective } from './directives/numbers-only.directive';
import {HttpClientModule} from '@angular/common/http'
import { ProductService } from './services/product.service';
import { ErrorPageComponent } from './components/error-page/error-page.component';
import { ProductDetailComponent } from './containers/product-detail/product-detail.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';

@NgModule({
  declarations: [
    AppComponent,
    ComponeComponent,
    ProductComponent,
    ProductListComponent,
    ConversionPipe,
    CurrencyComponent,
    CheckoutComponent,
    NumbersOnlyDirective,
    ErrorPageComponent,
    ProductDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
