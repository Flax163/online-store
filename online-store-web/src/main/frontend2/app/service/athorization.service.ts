import { Headers, Http } from '@angular/http';
import { Injectable } from '@angular/core';

import 'rxjs/add/operator/toPromise';
import { AuthDto } from "../dto/auth.ts";
import { TokenDto } from "../dto/token.ts";
import { BaseServiceJson } from "./base.service.json";

@Injectable()
export class AuthorizationService extends BaseServiceJson {
    private AUTHORIZATION_URL:string = '/rest/authorization';
    private VERIFY_TOKEN_URL:string = '/rest/verifyToken';

    constructor(private http: Http) {
        super();
    }

    authorization(authModel:AuthDto):Promise<TokenDto> {
        return this.http.post(this.AUTHORIZATION_URL, authModel, this.headers)
            .toPromise()
            .then(responce => responce.json())
            .catch(this.handleError)
    }

    verifyToken(tokenDto:TokenDto):Promise<TokenDto> {
        return this.http.post(this.VERIFY_TOKEN_URL, tokenDto, this.headers)
            .toPromise()
            .then(responce => responce.json())
            .catch(this.handleError);
    }
}