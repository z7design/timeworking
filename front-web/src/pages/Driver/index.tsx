import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import Pagination from '../../core/components/Pagination';
import { DriversResponse } from '../../core/types/Driver';
import { makeRequest } from '../../core/utils/request';
import DriverCard from './components/DriverCard';
import DriverCardLoader from './components/Loaders/DriverCardLoader';
import './styles.scss';

const Driver = () => {
    
    const [driversResponse, setDriverResponse] = useState<DriversResponse>();
    const [isLoading, setIsLoading] = useState(false);
    const [ activePage, setActivePage ] = useState(0);

    useEffect(() => {
        const params = {
            page: activePage,
            linesPerPage: 12,
        }
        setIsLoading(true);
        makeRequest({url:'/drivers', params})
        .then(response=>setDriverResponse(response.data))
        .finally(() => {
            setIsLoading(false);
        })
    }, [activePage]);

    return (
        <div className="driver-container">
            <h1 className="driver-title">
                Lista de Motoristas
            </h1>
            <div className="list-drivers">
               {isLoading ? <DriverCardLoader /> : (
               
                driversResponse?.content.map(driver => (
                    <Link to={`/drivers/${driver.id}`} key={driver.id}> 
                    <DriverCard  driver={driver}/>
                    </Link>
                    ))
               )}
               
            </div>
            {driversResponse && (
                <Pagination 
                    totalPages={ driversResponse.totalPages }
                    activePage={activePage}
                    onChange={page => setActivePage(page)}
                
                />
            )}
        </div>
    );

}
export default Driver;