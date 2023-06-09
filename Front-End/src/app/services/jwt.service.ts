import { JwtHelperService } from '@auth0/angular-jwt';
import { Injectable } from '@angular/core';

const jwtHelper = new JwtHelperService();

@Injectable({
    providedIn: 'root',
})
export class JwtService {
    isTokenValid(): Boolean {
        const account = localStorage.getItem('account') as string;
        const token = localStorage.getItem('token') as string;

        return JSON.parse(account) && !jwtHelper.isTokenExpired(token);
    }
}
