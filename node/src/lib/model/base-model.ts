import { Moment } from 'moment';
import { Model, DataTypes } from "sequelize";

export class BaseModel extends Model {
  id!: {
    type : DataTypes.IntegerDataType,
    primaryKey: true
  };
  deleted: boolean = false;
  createdDate: Moment;
  modifiedDate: Moment;
}