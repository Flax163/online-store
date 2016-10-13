import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule }    from '@angular/http';
import { routing } from './app.routing';

import { OnlineStoreComponent } from './online.store.component';

import { CookieService } from 'angular2-cookie/services/cookies.service';

@NgModule({
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        routing
    ],
    declarations: [OnlineStoreComponent],
    providers : [
        CookieService
    ],
    bootstrap: [OnlineStoreComponent]
})
export class OnlineStoreModule { }