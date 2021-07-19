import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import { ReactComponent as ArrowIcon } from '../../../../core/assets/images/arrow-icon.svg';
import { Driver } from '../../../../core/types/Driver';
import { makeRequest } from '../../../../core/utils/request';
import DriverDescriptionLoader from '../Loaders/DriverDescriptionLoader';
import DriverInfoLoader from '../Loaders/DriverInfoLoader';
import './styles.scss';

type ParamsType = {
    driversId: string;
}

const DriverDetails = () => {
    const { driversId } = useParams<ParamsType>();
    const [driver, setDriver] = useState<Driver>();
    const [isLoading, setIsLoading] = useState(false);

    useEffect(() => {
        setIsLoading(true);
        makeRequest({ url: `/drivers/${driversId}` })
            .then(response => setDriver(response.data))
            .finally(() => {
                setIsLoading(false);
            })
    }, [driversId]);

    return (
        <div className="driver-details-container">
            <div className="card-base border-radius-20 driver-details">
                <Link to="/drivers" className="driver-details-link text-decoration-none">
                    <ArrowIcon className="icon-goback" />
                    <h1 className="text-goback ">Voltar</h1>
                </Link>
                <div className="row">
                    <div className="col-6 pr-5">
                        {isLoading ? <DriverInfoLoader /> : (

                            <>
                                <div className="driver-details-card text-center">
                                    <img src="{driver?.imgUrl}" className="product-details-image" title={driver?.name} alt={driver?.name} />
                                </div>
                            </>

                        )}

                    </div>
                    <div className="col-6 driver-details-card">
                        {isLoading ? <DriverDescriptionLoader /> : (

                            <>
                             <h1 className="driver-description-title">
                                    Informações do Motorista
                                </h1>
                                <p>
                                    <ul className="driver-description-text">
                                        <h4> <li className="py-3">Nome: {driver?.name}</li></h4>
                                        <li>Telefone: {driver?.celphone}</li>
                                        <li>E-mail: {driver?.email}</li>
                                        <li>CNH: {driver?.cnh}</li>
                                        <li>RG: {driver?.rg}</li>
                                        <li>CPF: {driver?.cpf}</li>
                                    </ul>
                                </p>
                            </>

                        )}
                    </div>
                </div>
            </div>
        </div>
    );
}
export default DriverDetails;