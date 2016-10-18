import { Component, OnInit} from '@angular/core';
import { Metadata } from "../../model/metadata.model";
import { CookieService } from "angular2-cookie/core";

@Component({
    selector: 'top-menu',
    templateUrl: './top.menu.component.html'
})
export class TopMenuComponent implements OnInit {
    constructor(private metadata:Metadata,
                private cookiesService:CookieService) {
    }

    ngOnInit():void {
    }

    unAuthorization():void {
        this.metadata.unAuthorization();
    }
}