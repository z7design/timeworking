import React from 'react';
import { Switch, Route } from 'react-router-dom';
import { ReactComponent as AuthImage } from '../../core/assets/images/auth.svg'
import Login from './components/Login';
import './styles.scss';

const Auth = () => (
    <div className="auth-container">
        <div className="auth-info">
            <h1 className="auth-info-title">
            Escala de Horários <br />para Fretamento
            </h1>
            <p className="auth-info-subtle">
                 Crie, organize e otimize <br />a escala de horários.
            </p>
            <AuthImage />
        </div>
        <div className="auth-content">
            <Switch>
                <Route path="/auth/login" >
                    <Login />
                </Route>
                <Route path="/auth/register" >
                    <h1>Cadastro</h1>
                </Route>
                <Route path="/auth/recover" >
                    <h1>Recuperar</h1>
                </Route> 
            </Switch>
        </div>
            
    </div>
);
export default Auth;