import { Component, OnInit } from '@angular/core';
import { AuthorizationService } from "../../../service/athorization.service";
import { AuthDto } from "../../../dto/auth.dto.ts";
import { Metadata } from "../../../model/metadata.model";
import { CookieService } from "angular2-cookie/core";
declare var $;

@Component({
    selector: 'sign-in-dialog',
    templateUrl: './sign.in.component.html'
})
export class SignInComponent implements OnInit {
    private authModel:AuthDto;
    private authMessage:string;
    private rememberUser:boolean;

    constructor(private authorizationService:AuthorizationService,
                private metadata:Metadata,
                private cookieService:CookieService) {
    }

    ngOnInit():void {
        this.authModel = new AuthDto();
        this.authMessage = '';
        this.rememberUser = false;
    }

    authorization() {
        this.authorizationService.authorization(this.authModel,
            responce => {
                let token:string = responce.json().token;
                this.authMessage = '';
                this.metadata.authorization(token);
                if(this.rememberUser) {
                    this.cookieService.put('token', token);
                }
                $('#signInDialog').modal("hide");
            },
            () => {
                this.authMessage = 'Не удалось авторизоваться';
            }
        );
    }
}