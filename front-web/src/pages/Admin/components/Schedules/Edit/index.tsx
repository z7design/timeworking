import React from 'react';
import './styles.scss';
import { useForm } from 'react-hook-form';
import { useHistory } from 'react-router-dom';
import {  toast } from 'react-toastify';
import { makePrivateRequest } from '../../../../../core/utils/request';
import BaseForm from '../../BaseForm';
import './styles.scss';

type FormState = {
    driver: string;
    client: string;
    route: string;
    codeRoute: string;
    shift: string;
    dateRegister: string;
    hoursInitial: string;
    hoursFinish: string;
}
const Edit = () => {
    const {register, handleSubmit,  formState: { errors }} = useForm<FormState>();
    const history = useHistory();

    const onSubmit = (data: FormState) =>{
    
        makePrivateRequest({ url: '/schedules', method: 'POST', data })
        .then(() => {
            toast.info( 'Escala atualizada com sucesso' );
            history.push('/admin/schedules');
        })
        .catch(() => {
            toast.error('Erro ao atualizar escala')
        })
    }

    return (
        <form onSubmit={handleSubmit(onSubmit)}>
            <BaseForm title="Editar Escala">
                <div className="row">
                        <div className="col-6">
                            <div className="margin-bottom-30">
                                <input
                                    {...register('driver', 
                                    {required: "Campo obrigatório",
                                        minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                        maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                                    }
                                )} 
                                        name="driver"
                                        type="text" 
                                        className="form-control my-2 input-base"                
                                        placeholder="Motorista"
                                    />
                                {errors.driver && (
                                <div className="invalid-feedback login-link-recover d-block">
                                <p> {errors.driver.message}</p>
                            </div>
                            )}
                        </div>

                        <div className="margin-bottom-30">
                            <input
                                {...register('client', 
                                    {required: "Campo obrigatório",
                                    minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                    maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                                }
                                )} 
                                    name="client"
                                    type="text" 
                                    className="form-control my-2 input-base margin-bottom-30"                
                                    placeholder="Cliente"
                                />
                                    {errors.client && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> {errors.client.message}</p>
                                    </div>
                                )}
                        </div>

                        <div className="margin-bottom-30">
                            <input
                            {...register('route', 
                                    {required: "Campo obrigatório",
                                        minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                        maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                              }
                            )} 
                                name="route"
                                type="text" 
                                className="form-control my-2 input-base margin-bottom-30"                
                                placeholder="Rota"
                            />
                            {errors.route && (
                                    <div className="invalid-feedback login-link-recover d-block">
                                    <p> {errors.route.message}</p>
                                </div>
                                )}
                        </div>
                        
                        <div className="margin-bottom-30">
                            <input
                            {...register('codeRoute',
                                {required: "Campo obrigatório",
                                    minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                    maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                                }
                            )} 
                                name="codeRoute"
                                type="text" 
                                className="form-control my-2 input-base margin-bottom-30"                
                                placeholder="Codigo da Rota"
                            />
                            {errors.codeRoute && (
                                    <div className="invalid-feedback login-link-recover d-block">
                                    <p> {errors.codeRoute.message}</p>
                                </div>
                                )}
                        </div>
                    </div>{/*Fim da primeira coluna*/}
                
                    <div className="col-6">
                        <div className="margin-bottom-30">    
                            <input
                                {...register('shift',
                                    {required: "Campo obrigatório",
                                        minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                        maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                                    }  
                                )}                                   
                                    name="shift"
                                    type="text" 
                                    className="form-control my-2 input-base"                
                                    placeholder="Turno"     
                            />  
                                {errors.shift && (
                                    <div className="invalid-feedback login-link-recover d-block">
                                            <p> {errors.shift.message}</p>
                                    </div>
                                )}
                        </div>

                        <div className="margin-bottom-30">    
                            <input
                            {...register('hoursInitial', {required: "Campo Hora Inicial é obrigatório",
                                   
                                    minLength: {value: 5, message: 'Este campo deve ter no mínimo 5 caracters'},
                                    maxLength: {value: 60, message: 'Este campo deve ter no maximo 60 caracters'}
                                }
                            )} 
                                name="hoursInitial"
                                type="text" 
                                className="form-control my-2 input-base"                
                                placeholder="Hora Inicial"
                            />
                             {errors.hoursInitial && (
                                <div className="invalid-feedback login-link-recover d-block">
                                        <p> {errors.hoursInitial.message}</p>
                                </div>
                            )}
                        </div>   

                        <div className="margin-bottom-30">
                            <input
                                {...register('hoursFinish', {required: "Campo Hora Final é obrigatório"})} 
                                name="hoursFinish"
                                type="text" 
                                className="form-control input-base" 
                                placeholder="Hora Final"
                            />
                            {errors.hoursFinish && (
                                <div className="invalid-feedback login-link-recover d-block">
                                        <p> {errors.hoursFinish.message}</p>
                                </div>
                            )}
                        </div>
                        <div className="margin-bottom-30">
                                <input
                                        name="dateRegister"
                                        type="date" 
                                        className="form-control input-base" 
                                        placeholder="Informe a Data"
                                    />
                          
                        </div>{/*Fim da segunda coluna*/}

                        <div className="margin-bottom-30">
                                <div className="form-check form-check-inline">
                                    <input className="form-check-input" type="radio" name="entrada" id="flexRadioDefault1" />
                                        <label className="form-check-label">
                                            Entrada
                                        </label>
                                </div>
                                <div className="form-check form-check-inline">
                                    <input className="form-check-input" type="radio" name="saida" id="flexRadioDefault1" />
                                        <label className="form-check-label">
                                            Saida
                                        </label>
                                </div>
                        </div>        
                    </div>
                </div>
            </BaseForm>
        </form>
    );
}
export default Edit;