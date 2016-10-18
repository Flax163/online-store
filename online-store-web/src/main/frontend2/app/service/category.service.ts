import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import 'rxjs/add/operator/toPromise';
import { Category } from "../dto/category.dto";

@Injectable()
export class CategoryService {
    private LOAD_ALL_CATEGORIES_URL = "/rest/category";

    constructor(private http:Http) {
    }

    loadCategories():Promise<Category[]> {
        return this.http.get(this.LOAD_ALL_CATEGORIES_URL)
            .toPromise()
            .then(response => response.json() as Category[])
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any> {
        console.error('Error during load categories', error);
        return Promise.reject(error.message || error);
    }
}
