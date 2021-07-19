import React from 'react';
import { Link } from 'react-router-dom';
import { Schedules } from '../../../../../core/types/Schedules';
import FormSelects from '../FormSelects';
import './styles.scss';

type Props = {
    schedules: Schedules;
    onRemove: (schedulesId: number) => void;
}

const Card = ({ schedules, onRemove }: Props) => {
    return (
        <div className="card-base schedule-card-admin">
            <div className="row">
                <div className="col-2 ps-4 text-center border-right py-3"> 
                    <FormSelects /> 
                </div>
                <div className="col-2 text-center border-right py-3"> 
                    <FormSelects />              
               </div>
               <div className="col-2 text-center border-right py-3"> 
                    <FormSelects />              
               </div>
               <div className="col-2 text-center border-right py-3"> 
                    <FormSelects />              
               </div>
               <div className="col-4 py-3 d-flex justify-content-end">
                    <Link to="/admin/schedules/views">
                        <button className="btn btn-success me-md-2 text-uppercase" type="button">Visualizar</button>
                    </Link>
                    <Link 
                        to={`/admin/schedules/edit/${schedules.id}`}
                    >
                        <button className="btn  btn-secondary me-md-2 text-uppercase" type="button">Editar</button>
                    </Link>
                    <button 
                        type="button"
                        className="btn btn-outline-primary me-md-2 text-uppercase" 
                        onClick={() => onRemove(schedules.id)}
                    >
                        Excluir
                    </button>                    
               </div>
            </div>  
        </div>
        
    );
}
export default Card;