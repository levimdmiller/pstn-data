import { BaseModel } from "./base-model";
import { DataTypes } from "sequelize";

export class Transaction extends BaseModel {
  transactionId: {
    field: 'transaction_id',
    type: DataTypes.StringDataType
  };
  completed: boolean;
}