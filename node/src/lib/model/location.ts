import { BaseModel } from "./base-model";

export class Location extends BaseModel {
  city: string;
  state: string;
  country: string;
  zip: string;
}