import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {GreetingComponent} from './greeting/greeting.component';
import {HelloComponent} from './hello/hello.component';
import {RouterModule, Routes} from "@angular/router";
import {SupportService} from "./support.service";
import {HttpModule} from "@angular/http";
import { TreeCompComponent } from './tree/tree-comp.component';


const appRoutes: Routes = [
  {path: '', component: HelloComponent},
  {path: 'greeting', component: GreetingComponent},
  {path: 'hello', component: HelloComponent},
  {path: 'tree', component: TreeCompComponent}
]


@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    HelloComponent,
    TreeCompComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [SupportService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
