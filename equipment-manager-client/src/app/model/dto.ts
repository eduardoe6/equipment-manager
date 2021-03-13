export class LoginDto {
    public login: String
    public password: String
}

export class LoginResultDto {
    public userId: Number
    public login: String
    public name: String
    public token: String
}

export class EquipmentDto {
    public id: Number
    public name: String
    public type: String
}