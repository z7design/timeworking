import React from 'react';
import { Link, useHistory, useLocation } from 'react-router-dom';
import ButtonIcon from '../../../../core/components/ButtonIcon';
import AuthCard from '../Card';
import { makeLogin } from '../../../../core/utils/request';
import { useState } from 'react';
import { saveSessionData } from '../../../../core/utils/auth';
import { useForm } from 'react-hook-form';
import './styles.scss';

type FormData = {
    username: string;
    password: string;
}
type LocationState = {
    from: string;
}

const Login = () => {
    const { register, handleSubmit,  errors } =  useForm<FormData>();
    const [hasError, setHasError] = useState(false);
    const history = useHistory();
    let location = useLocation<LocationState>();

      const { from } = location.state || { from: { pathname: "/admin" } };
      const onSubmit = (data: FormData) => {
            makeLogin(data)
            .then(response =>{
                setHasError(false);
                saveSessionData(response.data);
                history.replace(from);
            })
            .catch(() => {
                setHasError(true); 
            })
        }

return (
    <AuthCard  title="Login">
          {hasError && (
               <div className="alert alert-primary mt-5">
                <h5>
                    Usuário ou Senha INVÁLIDO.
                </h5>
            </div>
          )}
      
        <form className="login-form" onSubmit={handleSubmit(onSubmit)}>
            <div className="margin-bottom-30">
                 <input   
                     type="email" 
                     className={`form-control input-base ${errors.username ? 'is-invalid' : ''}`} 
                     placeholder="Email"
                     name="username"
                     ref={register({
                        required: "Campo obrigatório",
                        pattern: {
                          value: /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i,
                          message: "Email inválido"
                        }
                    })}   
                 /> 
                  {errors.username && (
                    <div className="invalid-feedback login-link-recover d-block">
                       {errors.username.message}
                    </div>
                 )}  
             </div>

             <div className="margin-bottom-30">
                    <input 
                         type="password" 
                         className={`form-control input-base ${errors.password ? 'is-invalid' : ''}`} 
                         name="password"
                         ref={register({ required: "Campo obrigatório" })}
                         placeholder="Password" 
                    />
                   {errors.password && (
                    <div className="invalid-feedback login-link-recover d-block">
                       {errors.password.message}
                    </div>
                 )} 
             </div>

             <Link to="/auth/recover" className="login-link-recover">
                    Esquece a senha ?
                </Link>
               <div className="login-submit">
                    <ButtonIcon  text="Logar" />
               </div>
               <div>
                   <span className="not-registered">
                       Não tem cadastro?
                   </span>
                   <Link to="/auth/register" className="login-link-register">
                        CADASTRAR
                   </Link>
               </div>
        </form>
    </AuthCard>
 );
}
export default Login;