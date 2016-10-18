import { Component, OnInit} from '@angular/core';
import { Metadata } from "../../model/metadata.model";
import { CategoryService } from "../../service/category.service";
import { Category } from "../../dto/category.dto";
import { CookieService } from "angular2-cookie/core";

@Component({
    selector: 'top-menu',
    templateUrl: './top.menu.component.html'
})
export class TopMenuComponent implements OnInit {
    private categories:Category[];

    constructor(private metadata:Metadata,
                private categoryService:CategoryService,
                private cookiesService:CookieService) {
    }

    ngOnInit():void {
        this.categoryService.loadCategories()
            .then(categories => this.categories = categories);
    }

    unAuthorization():void {
        this.metadata.unAuthorization();
        this.cookiesService.remove('token');
    }
}