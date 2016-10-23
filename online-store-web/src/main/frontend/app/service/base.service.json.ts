import { Headers } from '@angular/http';

export class BaseServiceJson {
    protected headers = new Headers({'Content-Type': 'application/json'});

    protected handleError(error: any): Promise<any> {
        console.error('Error during loading: ', error);
        return Promise.reject(error.message || error);
    }
}