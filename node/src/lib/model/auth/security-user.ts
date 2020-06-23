import { BaseModel } from "lib/model/base-model";
import { SecurityRole } from "./security-role";

export class SecurityUser extends BaseModel {
  username: string;
  password: string;
  role: SecurityRole;
}