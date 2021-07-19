import React from 'react';
import { NavLink } from 'react-router-dom';
import { isAllowedByRole } from '../../../../core/utils/auth';
import './styles.scss';

const Navbar = () => (

    <nav>
        <div className="admin-nav-container">
            <ul>
                <li>
                    <NavLink to="/admin/schedules" className="admin-nav-item">Escalas</NavLink>
                </li>
                <li>
                    <NavLink to="/admin/routes" className="admin-nav-item">Rotas</NavLink>
                </li>
                <li>
                    <NavLink to="/admin/vehicles" className="admin-nav-item">Veiculos</NavLink>
                </li>
                <li>
                    <NavLink to="/admin/clients" className="admin-nav-item">Clientes</NavLink>
                </li>
                <li>
                    <NavLink to="/admin/drivers" className="admin-nav-item">Motoristas</NavLink>
                </li>
                {isAllowedByRole(['ROLE_ADMIN']) && (
                    <li>
                         <NavLink to="/admin/users" className="admin-nav-item">
                             Usuários
                        </NavLink>
                     </li>
                )}
                
            </ul>

        </div>
    </nav>

);

export default Navbar;