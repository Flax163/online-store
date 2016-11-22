import { Component, OnInit } from '@angular/core';
import { Metadata } from "./model/metadata.model";
import { CookieService } from "angular2-cookie/core";
import { AuthorizationService } from "./service/athorization.service";
import { isNullOrUndefined } from "util";
import { TokenDto } from "./dto/token";

@Component({
    selector: 'online-store',
    templateUrl: './online.store.component.html'
})
export class OnlineStoreComponent implements OnInit {
    constructor(private metadata:Metadata,
                private authorizationService:AuthorizationService,
                private cookieService:CookieService) {
    }

    ngOnInit():void {
        let token:string = this.cookieService.get('token');
        if (!isNullOrUndefined(token)) {
            this.authorizationService.authorizationByToken(new TokenDto(token))
                .then(() => {
                    console.log(token);
                    this.metadata.authorization(token);
                })
                .catch(() => {
                    this.metadata.unAuthorization();
                    this.cookieService.remove('token');
                });
        }
    }
}