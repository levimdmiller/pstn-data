import { BaseModel } from "./base-model";
import { Contact } from "./contact";
import { Media } from "./media";

export class Message extends BaseModel {
  uid: string;
  body: string;
  toContact: {
    field: 'to_contact',
    type: Contact
  };
  fromContact: {
    field: 'from_contact',
    type: Contact
  };
  media: Media;
}
