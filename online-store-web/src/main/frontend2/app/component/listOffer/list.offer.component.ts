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
    private categoryId:number;

    constructor(private offerService:OfferService,
                private route: ActivatedRoute) {
    }

    ngOnInit():void {
        this.route.params.subscribe(params => {
            this.categoryId = +params['id'];
        });
        alert(this.categoryId);
    }
}