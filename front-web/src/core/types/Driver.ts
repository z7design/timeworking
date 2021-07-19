export type DriversResponse = {

        content: Driver[];
        totalPages: number;

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