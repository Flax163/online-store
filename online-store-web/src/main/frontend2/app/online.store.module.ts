import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule }    from '@angular/http';
import { routing } from './app.routing';

import { OnlineStoreComponent } from './online.store.component';

import { CookieService } from 'angular2-cookie/services/cookies.service';
import { TopMenuComponent } from "./component/topMenu/top.menu.component";
import { SignInComponent } from './component/dialog/sign.in.component.ts/sign.in.component'

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        routing
    ],
    declarations: [
        OnlineStoreComponent,
        TopMenuComponent,
        SignInComponent
    ],
    providers : [
        CookieService
    ],
    bootstrap: [OnlineStoreComponent]
})
export class OnlineStoreModule { }