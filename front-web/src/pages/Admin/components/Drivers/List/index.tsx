import React from 'react';
import { useHistory } from 'react-router-dom';

const List= () => {
    const history = useHistory();

    const handleCreate = () => {
        history.push('/admin/drivers/create');
    }

    return(
        <div className="admin-drivers-list">
            <button className="btn btn-primary "onClick={ handleCreate }>
                ADICIONAR
            </button>
        </div>
    );
}
export default List;