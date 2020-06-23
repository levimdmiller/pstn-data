import { BaseModel } from "./base-model";

export class Contact extends BaseModel {
  private _number!: string;
  location: Location;

  get number(): string {
    return this._number;
  }

  set number(number: string) {
    this._number = number.trim();
  }
}