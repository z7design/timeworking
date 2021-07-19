export type SchedulesResponse = {
    content: Schedules[];
    totalPages: number;
}

export type Schedules = {
    id: number;
    driverss: Driver[];
    fleets: Fleet[];
    client: Client[];
    routes: Route[];
    hoursInitial: string;
    hoursFinish: string;
    shift: string;
    dateRegister: Date;
    inputType: string;
    outputType: string;
}

export type Driver = {
    id: number;
    name: string;
    imgUrl: string;
    celphone: string;
    email: string;
    cep: string;
    cnh: string;
    rg: string;
    cpf: string;
    fleets: Fleet[];
}

export type Fleet = {
    id: number;
    number: string;
    description: string;
} 

export type Client = {
    id: number;
    name: string;
    cpf: string;
    cnpj: string;
    razonSocial: string;
    email: string;
    imgUrl: string;
    dateRegister: string;
    route: Route[];
} 

export type Route = {
    id: number;
    name: string;
    codeRoute: string;
} 