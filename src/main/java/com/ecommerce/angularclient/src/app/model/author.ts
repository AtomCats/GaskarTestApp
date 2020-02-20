import {Book} from "./book";

export class Author {
   id: number;
   name: string;
   surname: string;
   middleName: string;
   birthDate: Date;
   books: Array<Book>;
}
