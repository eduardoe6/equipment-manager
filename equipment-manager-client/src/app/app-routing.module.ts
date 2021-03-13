import { NgModule } from '@angular/core';
import { Routes, RouterModule, Router, NavigationStart } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { EquipmentsComponent } from './equipments/equipments.component';
import { ReservationsComponent } from './reservations/reservations.component';
import { AuthService } from './service/auth.service';

const routes: Routes = [
    { path: 'login', component: LoginComponent },
    {
        path: 'home', component: HomeComponent, children: [
            { path: 'equipments', component: EquipmentsComponent },
            { path: 'reservations', component: ReservationsComponent }
        ]
    },
    { path: '', pathMatch: 'full', redirectTo: '/login' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {

    constructor(private authService: AuthService,
        private router: Router) {
        this.configureRouteListener()
    }

    configureRouteListener() {
        this.router.events.subscribe(event => {
            if (event instanceof NavigationStart) {

                // If the user is not logged in and 
                // the URL starts with /home, the application will redirect to
                // the login page
                if (event.url.startsWith("/home") && !this.authService.isUserAuth()) {
                    this.router.navigateByUrl("/login")
                } else if ((event.url == "/login" || event.url == "/")
                    && this.authService.isUserAuth()) {
                    // If the user is already logged in, and the url is /login
                    // the application will redirect to the home page
                    this.router.navigateByUrl("/home")
                }
            }
        })
    }
}
