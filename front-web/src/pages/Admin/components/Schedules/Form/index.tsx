import React, { useEffect, useState } from 'react';
import { useForm, Controller } from "react-hook-form";
import Select from 'react-select';
import { useHistory, useParams } from 'react-router-dom';
import {  toast } from 'react-toastify';
import { makePrivateRequest, makeRequest } from '../../../../../core/utils/request';
import { Client, Driver, Fleet, Route, Schedules } from '../../../../../core/types/Schedules';
import BaseForm from '../../BaseForm';
import './styles.scss';


type FormState = {
    driverss: Driver[];
    clients: Client[];
    fleets: Fleet[];
    routes: Route[];
    codeRoute: string;
    shift: string;
    hoursInitial: string;
    hoursFinish: string;
    dateRegister: string;
    inputType: string;
    outputType: string;  
}
type ParamsType = {
    schedulesId: string;
}

const Form = () => {
    const {register, handleSubmit,  formState: { errors }, setValue, control} = useForm<FormState>();
    const history = useHistory();
    const { schedulesId } = useParams<ParamsType>();

    const [isLoadingDrivers, setIsLoadingDrivers ] = useState(false);
    const [isLoadingClients, setIsLoadingClients ] = useState(false);
    const [isLoadingFleets, setIsLoadingFleets ] = useState(false);
    const [isLoadingRoutes, setIsLoadingRoutes ] = useState(false);

    const [driverss, setDriverss] = useState<Driver[]>([]);
    const [clients, setClients] = useState<Client[]>([]);
    const [fleets, setFleets] = useState<Fleet[]>([]);
    const [routes, setRoutes] = useState<Route[]>([]);

    const isEditing = schedulesId !== 'create';
    const formTitle = isEditing ? 'Editar Escala' : 'Cadastrar Escala';

    useEffect(() => {
        if(isEditing){
            makeRequest({ url: `/schedules/${schedulesId}` })
            .then(response => {
                setValue('driver', response.data.name);
                setValue('fleet', response.data.number);
                setValue('client', response.data.name);
                setValue('codeRoute',response.data.codeRoute);
                setValue('route', response.data.name);
                setValue('hoursInitial', response.data.hoursInitial);
                setValue('hoursFinish', response.data.hoursFinish);
                setValue('dateRegister', response.data.dateRegister.content);
                setValue('shift', response.data.shift);
                setValue('inputType', response.data.inputType);
                setValue('outputType', response.data.outputType);
            })
        }
    }, [schedulesId, isEditing, setValue]);
 
    //Listando os motoristas
    useEffect(() => {
        setIsLoadingDrivers(true);
        makeRequest({url: '/drivers'})
        .then(response => setDriverss(response.data.content))
        .finally(() => setIsLoadingDrivers(false));
    }, []);

            //Listando as Frota
        useEffect(() => {
            setIsLoadingFleets(true);
            makeRequest({url: '/fleets'})
            .then(response => setFleets(response.data.content))
            .finally(() => setIsLoadingClients(false));
        }, []);

        //Listando os Clientes
        useEffect(() => {
            setIsLoadingClients(true);
            makeRequest({url: '/clients'})
            .then(response => setClients(response.data.content))
            .finally(() => setIsLoadingClients(false));
        }, []);

        //Listando os Rotas
        useEffect(() => {
            setIsLoadingRoutes(true);
            makeRequest({url: '/routes'})
            .then(response => setRoutes(response.data.content))
            .finally(() => setIsLoadingRoutes(false));
        }, []);

    const onSubmit = (data: FormState) =>{
    
        makePrivateRequest({ 
            url: isEditing ? `/schedules/${schedulesId}` : '/schedules',
            method: isEditing ? 'PUT' : 'POST', 
            data 
        })
        .then(() => {
            toast.info( 'Escala cadastrada com sucesso' );
            history.push('/admin/schedules');
        })
        .catch(() => {
            toast.error('Erro ao cadastrar escala')
        })
            console.log(data);
    }

    return (
        <form onSubmit={handleSubmit(onSubmit)}>
            <BaseForm title={formTitle}>
                
                <div className="row">
                        <div className="col-6">{/*Inicio da primeira coluna*/}
                            <div className="margin-bottom-30 mt-2">

                                <Controller 
                                    as={Select}
                                    name="driverss"
                                    rules={{ required: true}}
                                    control={control}
                                    isLoading={isLoadingDrivers}
                                    options={driverss}
                                    getOptionLabel={(option: Driver) => option.name}
                                    getOptionValue={(option: Driver) => String(option.id)}
                                    classNamePrefix="schedules-drivers"
                                    placeholder="Motorista"
                                    defaultValue=""
                                />
                                 {errors.driverss && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> Campo obrigatorio</p>
                                    </div>
                                )}
                            </div>{/*Fim do input Driver*/}
                        
                            <div className="margin-bottom-30">
                                <Controller
                                    as={Select}
                                    name="clients"
                                    rules={{ required: true }}
                                    isLoading={isLoadingClients}
                                    control={control}
                                    options={clients}
                                    getOptionLabel={(option: Client) => option.name}
                                    getOptionValue={(option: Client) => String(option.id)}
                                    classNamePrefix="schedules-drivers"
                                    placeholder="Cliente"
                                    defaultValue=""
                                />  
                                 {errors.clients && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> Campo obrigatorio</p>
                                    </div>
                                )}
                            </div>{/*Fim do input client*/}
                            <div className="margin-bottom-30">    
                                <Controller
                                    as={Select} 
                                    name="fleets"
                                    rules={{required: true}}
                                    control={control}
                                    isLoading={isLoadingFleets}
                                    options={fleets}
                                    getOptionLabel={(option: Fleet) => option.number}
                                    getOptionValue={(option: Fleet) => String(option.id)}
                                    classNamePrefix="schedules-drivers"
                                    placeholder="Frota"
                                    defaultValue=""
                                />
                                 {errors.fleets && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> Campo obrigatorio</p>
                                    </div>
                                )}
                            </div>{/*Fim  do input fleets*/}
                            <div className="margin-bottom-30">  
                                <Controller
                                    as={Select}
                                    name="routes"
                                    rules={{ required: true }}
                                    control={control}
                                    isLoading={isLoadingRoutes}
                                    options={routes}
                                    getOptionLabel={(option: Route) => option.codeRoute}
                                    getOptionValue={(option: Route) => String(option.id)}
                                    classNamePrefix="schedules-drivers"
                                    placeholder="Codigo da Rota"
                                    defaultValue=""
                                /> 
                                 {errors.routes && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> Campo obrigatorio</p>
                                    </div>
                                )}
                            </div>{/*Fim do input routes*/}
                            <div className="margin-bottom-30">  
                                <Controller
                                    as={Select}
                                    name="routes"
                                    rules={{ required: true }}
                                    control={control}
                                    isLoading={isLoadingRoutes}
                                    options={routes}
                                    getOptionLabel={(option: Route) => option.name}
                                    getOptionValue={(option: Route) => String(option.id)}
                                    classNamePrefix="schedules-drivers"
                                    placeholder="Rota"
                                    defaultValue=""
                                /> 
                                 {errors.routes && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                        <p> Campo obrigatorio</p>
                                    </div>
                                )}
                            </div>{/*Fim do input routes*/}
                           
                    </div>{/*Fim da primeira coluna*/}
                    
                    <div className="col-6"> {/*Inicio da segunda coluna*/}
                                <div className="margin-bottom-20">    
                                    <input
                                        ref={register(
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
                                     ref={register({required: "Campo Hora Inicial é obrigatório",
                                        
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
                                        ref={register({required: "Campo Hora Final é obrigatório"})} 
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
                                        ref={register({required: "Campo Data é obrigatório"})} 
                                        name="dateRegister"
                                        type="date" 
                                        className="form-control input-base" 
                                        placeholder="Informe a data"
                                    />
                                    {errors.dateRegister && (
                                        <div className="invalid-feedback login-link-recover d-block">
                                                <p> {errors.dateRegister.message}</p>
                                        </div>
                                    )}
                                </div>
                                    
                                <div className="margin-bottom-30">
                                    <div className="form-check form-check-inline">
                                        <input 
                                            ref={register({})} 
                                            className="form-check-input" 
                                            type="radio" 
                                            name="inputType" 
                                            id="flexRadioDefault1" 
                                            value="1"
                                        />
                                            <label className="form-check-label">
                                                Entrada
                                            </label>
                                    </div>{/*Fim do input radio entrada*/}
                                    <div className="form-check form-check-inline">
                                        <input 
                                            ref={register({})}
                                            className="form-check-input"
                                            type="radio" 
                                            name="outputType" 
                                            id="flexRadioDefault1"
                                            value="1"
                                        />
                                            <label className="form-check-label">
                                                Saida
                                            </label>
                                    </div>{/*Fim do input radio saida*/}
                                </div>               
                                   
                    </div>{/*Fim da segunda coluna*/}
                </div>{/*Fim da row*/}
                
            </BaseForm>
        </form>
    );
}
export default Form;