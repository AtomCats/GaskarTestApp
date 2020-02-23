import {Book} from './book';
import {Publisher} from "./publisher";
import {Tag} from "./tag";

export class Author {
   id: number;
   name: string;
   surname: string;
   middleName: string;
   birthDate: Date;
   books: Array<Book>;

  constructor(args: {
    name: string,
    surname: string,
    middleName: string,
    birthDate: Date,
    books: Book[],
    id: number
  }) {
    this.id = args.id,
    this.name = args.name,
    this.surname = args.surname,
    this.middleName = args.middleName,
    this.birthDate = args.birthDate,
    this.books = args.books.map(json => new Book(json));
  }
}
