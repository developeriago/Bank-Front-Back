import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

const routes: Routes = [
    {
        path: "",
        loadChildren: () => import("./singin/singin.module").then((module) => module.SinginModule),
    },
    {
        path: "cadastrar",
        loadChildren: () => import("./singup/singup.module").then((module) => module.SingupModule),
    },
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule],
})
export class AuthRoutingModule {}
