import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";

import { SinginRoutingModule } from "./singin-routing.module";
import { SinginComponent } from "./singin.component";
import { SharedModule } from "src/app/shared/shared.module";

@NgModule({
    declarations: [SinginComponent],
    imports: [
        CommonModule,
        SinginRoutingModule,
        SharedModule
    ],
})
export class SinginModule {}
