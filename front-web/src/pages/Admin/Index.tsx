import React from 'react';
import { Switch } from 'react-router';
import PrivateRoute from '../../core/components/Routes/PrivateRoute';
import Drivers from './components/Drivers';
import Navbar from './components/Navbar';
import Schedules from './components/Schedules';

import './styles.scss';

const Admin = () => (
    <div className="admin-container">
         <Navbar />
         <div className="admin-content">
            <Switch>
                <PrivateRoute path="/admin/schedules" >
                   <Schedules />
                </PrivateRoute>
                <PrivateRoute path="/admin/schedules/crete" >
                   <Schedules />
                </PrivateRoute>
                <PrivateRoute path="/admin/routes" >
                    <h1>Rotas</h1>
                </PrivateRoute>
                <PrivateRoute path="/admin/vehicles" >
                    <h1>Veiculos</h1>
                </PrivateRoute>
                <PrivateRoute path="/admin/clients" >
                    <h1>Clientes</h1>
                </PrivateRoute>
                <PrivateRoute path="/admin/drivers" >
                    <Drivers />
                </PrivateRoute>
                <PrivateRoute path="/admin/users" allowedRoutes={['ROLE_ADMIN']}>
                    <h1>Usuários</h1>
                </PrivateRoute>
            </Switch>
         </div>   
    </div>
);

export default Admin;