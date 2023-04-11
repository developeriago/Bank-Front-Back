import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";

import { AccountRoutingModule } from "./account-routing.module";
import { AccountComponent } from "./account.component";
import { SharedModule } from "src/app/shared/shared.module";

@NgModule({
    declarations: [AccountComponent],
    imports: [
        CommonModule,
        AccountRoutingModule,
        SharedModule
    ],
})
export class AccountModule {}
