import React from 'react';
import './styles.scss';

type Props = {
    title: string;
    children: React.ReactNode;
}

const AuthCard = ({ title, children }: Props) => {
    return (
        <div className="card-base auth-card">
            <div className="auth-card-title">
               <h1> {title}</h1>
               { children }
            </div>
        </div>
    );
}
export default AuthCard;