import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { SidebarComponent } from "./pages/sidebar/sidebar.component";

const routes: Routes = [
    {
        path: "",
        redirectTo: "login",
        pathMatch: "full",
    },
    {
        path: "login",
        loadChildren: () => import("./pages/auth/auth.module").then((module) => module.AuthModule),
    },
    {
        path: "dashboard",
        loadChildren: () => import("./pages/dashboard/dashboard.module").then((module) => module.DashboardModule),
        component: SidebarComponent,
    },
    {
        path: "conta-bancaria",
        loadChildren: () => import("./pages/account/account.module").then((module) => module.AccountModule),
        component: SidebarComponent,
    },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
})
export class AppRoutingModule {}
