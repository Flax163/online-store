import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import { BaseServiceJson } from './base.service.json';
import { OfferDto } from '../dto/offer';


@Injectable()
export class OfferService extends BaseServiceJson {
    private LOAD_ALL_OFFERS_FROM_CATEGORY:string = "/rest/category/";

    constructor(private http:Http){
        super();
    }

    loadOffersFromCategory(idCategory:number):Promise<OfferDto[]>{
        return this.http.get(this.LOAD_ALL_OFFERS_FROM_CATEGORY + idCategory + '/offer', this.headers)
            .toPromise()
            .then(response => response.json() as OfferDto[])
            .catch(this.handleError);
    }
}