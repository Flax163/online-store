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
                this.authMessage = '';
                this.metadata.token = responce.json().token;
                if(this.rememberUser) {
                    this.cookieService.put('token', this.metadata.token);
                }
                $('#signInDialog').modal("hide");
            },
            error => {
                this.authMessage = 'Не удалось авторизоваться';
            }
        );
    }
}