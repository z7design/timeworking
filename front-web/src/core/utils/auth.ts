import jwtDecode from "jwt-decode";
import history from "./history";
export const CLIENT_ID = 'timework';
export const CLIENT_SECRET = 'timework123';

type LoginResponse = {
    access_token: string;
    token_type: string;
    expires_in: number;
    scope: string;
    userFirstanem: string;
    userId: number;
}

export type Role = 'ROLE_OPERATOR' | 'ROLE_ADMIN';

type AccessToken = {
    exp: number;
    user_name: string;
    authorities:Role[];
}

export const saveSessionData = (loginResponse: LoginResponse) => {
    localStorage.setItem('authData', JSON.stringify(loginResponse));
}

export const getSessionData = () => {
    const sessionData = localStorage.getItem('authData') || '{}';
    const parsedSessionData = JSON.parse(sessionData);

    return parsedSessionData as LoginResponse;

}

export const getAccessTokenDecoded = () => {
    const sessionData = getSessionData();

   try {

    const tokenDecoded = jwtDecode(sessionData.access_token);
    //fazendo um casting
    return tokenDecoded as AccessToken;

   }catch(error){
        return {} as AccessToken;
   }

}
export const isTokenValid = () => {
    const { exp } = getAccessTokenDecoded();
    return Date.now() <= exp * 1000;  
}
export const isAuthenticated = () => {
   //"authData" tem que estar no localStage
    //access_token não poder espirado   
    const sessionData = getSessionData();  
    return sessionData.access_token && isTokenValid();

}

export const isAllowedByRole = (routeRoles: Role[] = []) => {

    if(routeRoles.length === 0){
        return true;
    }
    const { authorities } = getAccessTokenDecoded();

    return routeRoles.some(role => authorities?.includes(role));
}

export const logout = () => {
    localStorage.removeItem('authData');
    history.replace('/auth/login')
}
