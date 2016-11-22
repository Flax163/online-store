import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { CategoryService } from "../../service/category.service";
import { OfferService } from "../../service/offer.service";
import { OfferDto } from "../../dto/offer";

@Component({
    selector: 'list-offer',
    templateUrl: './list.offer.component.html'
})
export class ListOfferComponent implements OnInit {
    private offers:OfferDto[];

    constructor(private offerService:OfferService,
                private route:ActivatedRoute) {
    }

    ngOnInit():void {
        this.route.params.subscribe(params => {
            this.offerService.loadOffersFromCategory(params['id'])
                .then(offers => this.offers = offers as OfferDto[])
        });
    }
}