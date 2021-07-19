import React from 'react';
import { Router, Switch, Route, Redirect} from 'react-router-dom';
import Navbar from './core/components/Navbar';
import About from './pages/About';
import Admin from './pages/Admin/Index';
import Auth from './pages/Auth';
import Contact from './pages/Contact';
import Driver from './pages/Driver';
import DriverDetails from './pages/Driver/components/DriverDetails';
import Home from './pages/Home';
import history from './core/utils/history';
import Clients from './pages/Admin/components/Clients';

const Routes = () => (
    <Router history={ history }>
    <Navbar />
       <Switch>
            <Route path="/" exact>
                <Home />
            </Route>  
            <Route path="/about">
                <About />
            </Route>
            
            <Route path="/contact">
                <Contact/>
            </Route>

            <Route path="/drivers" exact>
                <Driver/>
            </Route>

            <Route path="/drivers/:driversId">
                <DriverDetails/>
            </Route>

            <Route path="/clients" exact>
                <Clients/>
            </Route>

            <Route path="/clients/:clientsId">
                <DriverDetails/>
            </Route>

            <Redirect from="/auth" to="/auth/login" exact/>
            <Route path="/auth">
                <Auth />
            </Route>

            <Redirect from="/admin" to="/admin/schedules" exact/>
            <Route path="/admin">
                <Admin />     
            </Route>
       </Switch>
    </Router>
);

export default Routes;