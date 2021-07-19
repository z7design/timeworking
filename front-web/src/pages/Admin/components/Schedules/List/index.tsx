import React, { useEffect, useState, useCallback } from 'react';
import { useHistory } from 'react-router-dom';
import { toast } from 'react-toastify';
import Pagination from '../../../../../core/components/Pagination';
import { SchedulesResponse } from '../../../../../core/types/Schedules';
import { makePrivateRequest, makeRequest } from '../../../../../core/utils/request';
import Card from '../Card';
import CardLoader from '../Loaders/ProductCardLoader';

const List= () => {
    const [schedulesResponse, setSchedulesResponse] = useState<SchedulesResponse>();
    const [isLoading, setIsLoading] = useState(false);
    const [ activePage, setActivePage ] = useState(0);
    const history = useHistory();

   const getSchedules = useCallback(() => {
    const params = {
        page: activePage,
        linesPerPage: 4,
        direction: 'DESC',
        orderBy: 'id'
    }
        setIsLoading(true);
        makeRequest({url:'/schedules', params})
        .then(response=>setSchedulesResponse(response.data))
        .finally(() => {
            setIsLoading(false);
        })
   }, [activePage]);

    useEffect(() => {
        getSchedules();
    }, [getSchedules]);

    const handleCreate = () => {
        history.push('/admin/schedules/create');
    }

    const onRemove = ( schedulesId: number ) => {
        const confirm = window.confirm('DESEJA REALMENTE EXCLUIR ESTA ESCALA?')
        if(confirm){
            makePrivateRequest({url: `/schedules/${schedulesId}`, method: 'DELETE'})
            .then(() => {
                toast.info( 'Escala deletada com sucesso' );
                getSchedules();
            })
            .catch(() => {
                toast.error('Erro ao deletar a escala"')
            })
        }
    }

    return(
        <div className="admin-schedules-list">
            <button className="btn btn-primary "onClick={ handleCreate }>
                <h5 className="text-white">Criar Escala</h5>
            </button>
            <div className="admin-list-container">
                {isLoading ? <CardLoader /> : (
                    schedulesResponse?.content.map( schedules => (
                        <Card schedules={schedules} key={schedules.id} onRemove={onRemove} />
                   ))
                )}
                
                {schedulesResponse && (
                    <Pagination 
                        totalPages={ schedulesResponse.totalPages }
                        activePage={activePage}
                        onChange={page => setActivePage(page)}
                    />
                )}
            </div>   
        </div>
    );
}
export default List;