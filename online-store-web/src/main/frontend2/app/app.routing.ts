import { ModuleWithProviders }  from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CartComponent } from "./component/cart/cart.component";
import { AboutComponent } from "./component/about/about.component";
import { WelcomeComponent } from "./component/welcome/welcome.component";

const appRoutes: Routes = [
    {path: 'cart', component: CartComponent},
    {path: 'about', component: AboutComponent},
    {path: '', component:WelcomeComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);