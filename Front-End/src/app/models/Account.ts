export class Account {
    id?: string;
    nome?: string;
    cpf?: string;
    senha?: string;

    constructor(
        id?: string,
        nome?: string,
        cpf?: string,
        password?: string,
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = password;
    }
}
