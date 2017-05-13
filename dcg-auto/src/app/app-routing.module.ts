import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/index';
import { InventoryComponent } from './inventory-component/index';

const routes: Routes = [
    { path: '', pathMatch: 'full', component: HomeComponent },
    { path: 'inventory', component: InventoryComponent },
    { path: 'inventory/', component: InventoryComponent },
    { path: 'inventory/:query', component: InventoryComponent },
    { path: 'inventory-details/:stockNumber', component: InventoryComponent },
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }


export const appRoutingProviders: any[] = [

];
export const routing = [HomeComponent, InventoryComponent];
