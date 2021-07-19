import React from 'react';
import { Route, Switch } from 'react-router';
import Form from './Form';
import List from './List';

const Drivers = () => {

    return(
        <div>
            <Switch>
                <Route path="/admin/drivers" exact>
                    <List />
                </Route>
                <Route path="/admin/drivers/create">
                  <Form />
                </Route>
                <Route path="/admin/drivers/:driversId">
                    <h1>Editar Motorista</h1>
                </Route>
            </Switch>
        </div>
    );

}
export default Drivers;