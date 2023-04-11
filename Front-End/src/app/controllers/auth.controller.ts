import { firstValueFrom } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from 'src/environments/environment';
import { Account } from '../models/Account';
import { LoginDTO } from '../dtos/login.dto';

@Injectable({
    providedIn: "root"
})
export class AuthController{

    //private api: string = environment.api;
    private readonly API = 'api'

    constructor( private http: HttpClient){}

    async create(account: Account): Promise<any> {
        return await firstValueFrom(
                    this.http
                    .post(`${this.API}/cadastro`, account).pipe());
    }

    async login(account: Account): Promise<LoginDTO> {

        return await firstValueFrom(
            this.http.post<LoginDTO>(`${this.API}/login`, account));
    }

}
