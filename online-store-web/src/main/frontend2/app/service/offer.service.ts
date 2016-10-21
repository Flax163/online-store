import { BaseServiceJson } from './base.service.json';
import { Http } from '@angular/http';
import { OfferDto } from "../dto/offer";

export class OfferService extends BaseServiceJson {
    private LOAD_ALL_OFFERS_FROM_CATEGORY:string = "";

    constructor(private http:Http){
    }

    loadOffersFromCategory():Promise<OfferDto[]>{
        return this.http.get(this.LOAD_ALL_OFFERS_FROM_CATEGORY, this.headers)
            .toPromise()
            .then(response => response.json() as OfferDto[])
            .catch(this.handleError);
    }
}