import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CartComponent } from "./component/cart/cart.component";
import { AboutComponent } from "./component/about/about.component";
import { WelcomeComponent } from "./component/welcome/welcome.component";
import { ListOfferComponent } from "./component/listOffer/list.offer.component";

const appRoutes: Routes = [
    {path: 'cart', component: CartComponent},
    {path: 'about', component: AboutComponent},
    {path: 'listOffer/:id', component: ListOfferComponent},
    {path: '', component:WelcomeComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);