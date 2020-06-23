import { BaseModel } from "./base-model";
import { DataTypes } from "sequelize";

export class Media extends BaseModel {
  url: string;
  contentType: {
    field: 'content_type',
    type: DataTypes.StringDataType
  };
  message: {
    field: 'message_id',
    type: DataTypes.StringDataType
  };
}