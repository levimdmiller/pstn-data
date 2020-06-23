import { BaseModel } from "./base-model";
import { DataTypes } from "sequelize";
import {ChatUserType} from "./chat-user-type";
import {Contact} from "./contact";

export class ChatUser extends BaseModel {
  ownerId: {
    field: 'owner_id',
    type: DataTypes.StringDataType
  };
  userType: {
    field: 'user_type',
    type: ChatUserType
  };
  contact: Contact;
}
