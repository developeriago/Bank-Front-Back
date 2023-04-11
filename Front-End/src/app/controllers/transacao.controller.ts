import { firstValueFrom } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Account } from '../models/Account';
import { LoginDTO } from '../dtos/login.dto';

@Injectable({
    providedIn: "root"
})
export class Transacao{

    //private api: string = environment.api;
    private readonly API = 'conta'

    constructor( private http: HttpClient){}

    async deposito(transacao: Transacao): Promise<any> {
        return await firstValueFrom(
                    this.http
                    .post(`${this.API}/depositar`, transacao).pipe());
    }



}
