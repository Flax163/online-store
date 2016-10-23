export class Metadata {
    private token:string;
    private authStatus:boolean;

    authorization(token:string) {
        this.token = token;
        this.authStatus = true;
    }

    unAuthorization() {
        this.token = '';
        this.authStatus = false;
    }

    getToken():string {
        return this.token;
    }

    isAuthorization():boolean {
        return this.authStatus;
    }

}