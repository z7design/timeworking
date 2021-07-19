import React, { useEffect, useState } from 'react';
import { Link, NavLink, useLocation } from 'react-router-dom';
import { getAccessTokenDecoded, logout } from '../../utils/auth';
import './styles.scss';

const Navbar = () => {

    const [ currentUser , setCurrentUser] = useState('');
    const location = useLocation();

    useEffect(() => {
           const curruentUserData = getAccessTokenDecoded();
           setCurrentUser(curruentUserData.user_name);
    }, [location])

    const handleLogout = (event: React.MouseEvent<HTMLAnchorElement, MouseEvent>) => {
            event.preventDefault();
            logout();
    }

    return (
        <nav className="row bg-primary main-nav">
            <div className="col-3">
               <NavLink to="/" className="nav-logo-text">
                     <h4>TimeWORK</h4>
               </NavLink>
            </div>
            <div className="col-6">
                <ul className="main-menu">
                    <li>
                        <NavLink to="/" className="nav-link">
                            Home
                        </NavLink>
                   </li>
                   <li>
                        <NavLink to="/about" className="nav-link">
                            Sobre
                        </NavLink>
                   </li>
                   <li>
                        <NavLink to="/admin" className="nav-link">
                            Admin
                        </NavLink>
                   </li>
                   <li>
                        <NavLink to="/drivers" className="nav-link">
                            Motoristas
                        </NavLink>
                   </li>
                   <li>
                        <NavLink to="/contato" className="nav-link">
                            Contato
                        </NavLink>
                   </li>
                </ul>
            </div>
            <div className="col-3">
            { currentUser && (
                <>
                    {currentUser}
                    <a href="#logout" 
                    className="nav-link active d-inline"
                    onClick={handleLogout}
                    >
                            LOGOUT
                    </a>
                </>
            )}
               { !currentUser && (
                    <Link to="/auth/login" className="nav-link active">
                        LOGIN
                    </Link>
                )}
            </div>
        </nav>  
    );

}
export default Navbar;