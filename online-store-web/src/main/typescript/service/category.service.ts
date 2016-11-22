import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import 'rxjs/add/operator/toPromise';

import { Category } from "../dto/category";
import { BaseServiceJson } from "./base.service.json";

@Injectable()
export class CategoryService extends BaseServiceJson{
    private LOAD_ALL_CATEGORIES_URL = "/rest/category";

    constructor(private http:Http) {
        super();
    }

    loadCategories():Promise<Category[]> {
        return this.http.get(this.LOAD_ALL_CATEGORIES_URL, this.headers)
            .toPromise()
            .then(response => response.json() as Category[])
            .catch(this.handleError);
    }
}
