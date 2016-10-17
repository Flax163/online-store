export class Metadata {
    private token:string;
    private authorization:boolean;

    public authorization(token:string):void {
        this.token = token;
        this.authorization = true;
    }

    public unAuthorization():void {
        this.token = '';
        this.authorization = false;
    }

    public getToken():string {
        return this.token;
    }

    public isAuthorization():boolean {
        return this.authorization;
    }

}