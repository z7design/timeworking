import React from 'react';
import {ReactComponent  as DriverImage} from '../../../../core/assets/images/driver-icon.svg'
import { Driver } from '../../../../core/types/Driver';
import './styles.scss';

type Props = {
    driver: Driver;
}

const DriverCard = ({ driver }: Props) => (
    <div className="card-base border-radius-10 driver-card">
        <img src={driver.imgUrl} title={driver.name} alt={driver.name} className="driver-card-img"/>
        <div className="driver-info">
            <div className="driver-name">
                {driver.name}
            </div>
            <div className="driver-info-jobs">
               <ul>
                   <li> Tel: {driver.celphone}</li>
                   <li>E-mail: {driver.email}</li>              
               </ul>  
            </div>
        </div>
    </div>
);
export default DriverCard;