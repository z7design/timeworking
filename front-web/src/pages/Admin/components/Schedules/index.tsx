import React from 'react';
import { Route, Switch } from 'react-router-dom';
import Form from './Form';
import List from './List';
import Views from './Views';


const schedules = () => {

    return (
        <div>
            <Switch>
                <Route path="/admin/schedules" exact>
                    <List />
                </Route>
                <Route path="/admin/schedules/views" exact>
                    <Views />
                </Route>
                <Route path="/admin/schedules/:schedulesId">
                    <Form />
                </Route>
            </Switch>
        </div>
    );

}
export default schedules;