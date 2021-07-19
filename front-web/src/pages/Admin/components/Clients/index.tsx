import React from 'react';
import { Route, Switch } from 'react-router';
import Form from './Form';
import List from './List';

const Clients = () => {

    return(
        <div>
            <Switch>
                <Route path="/admin/clients" exact>
                    <List />
                </Route>
                <Route path="/admin/clients/create">
                  <Form />
                </Route>
                <Route path="/admin/clients/:clientsId">
                    <h1>Editar Clientes</h1>
                </Route>
            </Switch>
        </div>
    );

}
export default Clients;