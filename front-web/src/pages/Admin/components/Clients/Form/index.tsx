import React,  { useState } from 'react';
import { makePrivateRequest } from '../../../../../core/utils/request';
import { toast } from 'react-toastify';
import BaseForm from '../../BaseForm';
import './styles.scss';
import { useHistory } from 'react-router-dom';

type FormState = {
    name: string;
    email: string;
    description: string;
}
type FormEvent =  React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>;

const Form = () => {
    const [formData, setFormData] = useState<FormState>({
        name: '',
        email:'',
        description: '',
    });
    const history = useHistory();
    const handleOnChange = (event: FormEvent) =>{
        const name= event.target.name;
        const value=event.target.value;
   
        setFormData(data => ({ ...data, [name]: value}));
    }
    
    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) =>{
        event.preventDefault();
        const payload = {
            ...formData,
            imgUrl: 'http://www.mgplocadora.com.br/images/xlocacao-de-onibus-e-micro-onibus-1.png.pagespeed.ic.Fjd2Ii-rRN.png'    
        }

        makePrivateRequest({ url: '/clients', method: 'POST', data: payload })
        .then(() => {
            setFormData({ name: '', email: '', description: ''});
            toast.info( 'Cliente cadastrado com sucesso' );
            history.push('/admin/clients');
        });
    }

    return (
        <form onSubmit={handleSubmit}>
            <BaseForm title="Cadastrar Cliente">
                <div className="row">
                        <div className="col-6">
                        <input
                            value={formData.name}
                            name="name"
                            type="text" 
                            className="form-control margin-bottom-30 input-base" 
                            onChange={handleOnChange}
                            placeholder="Nome do Motorista"
                        />
                        <input
                            value={formData.email}
                            name="email"
                            type="text" 
                            className="form-control margin-bottom-30 input-base" 
                            onChange={handleOnChange}
                            placeholder="E-mail do cliente"
                        />
                    </div>
                    <div className="col-6">
                        <textarea 
                            name="description"
                            value={formData.description}
                            onChange={handleOnChange}
                            className="form-control input-base"
                            placeholder="Informações adicionais"
                            cols={30}
                            rows={10}
                         >
                        </textarea>
                    </div>
                </div>
            </BaseForm>
            
        </form>
    );
}
export default Form;