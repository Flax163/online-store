import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import 'rxjs/add/operator/toPromise';
import { AuthDto } from "../dto/auth.dto.ts";

@Injectable()
export class AuthorizationService {
    private AUTHORIZATION_URL:string = '/rest/authorization';
    private VERIFY_TOKEN_URL:string = '/rest/verifyToken';

    constructor(private http: Http) {
    }

    authorization(authModel:AuthDto, success:Function, error:any):Promise<string> {
        return this.http.post(this.AUTHORIZATION_URL, authModel)
            .toPromise()
            .then(success)
            .catch(error)
    }

    verifyToken(token:string, success:Function, error:any):Promise<void> {
        return this.http.post(this.VERIFY_TOKEN_URL, token)
            .toPromise()
            .then(success)
            .catch(error);
    }
}