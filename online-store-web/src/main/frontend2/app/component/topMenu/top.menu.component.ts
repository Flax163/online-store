import { Component, OnInit} from '@angular/core';
import {Metadata} from "../../model/metadata.model";

@Component({
    selector: 'top-menu',
    templateUrl: './top.menu.component.html'
})
export class TopMenuComponent implements OnInit {
    constructor(private metadata:Metadata) {
    }

    ngOnInit():void {
    }
}