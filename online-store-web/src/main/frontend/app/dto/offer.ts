export class OfferDto {
    public id:number;
    public name:string;
    public description:string;
    public pathImage:string;

    constructor(id:number,
                name:string,
                description:string,
                pathImage:string){
        this.id = id;
        this.name = name;
        this.description = description;
        this.pathImage = pathImage;
    }
}