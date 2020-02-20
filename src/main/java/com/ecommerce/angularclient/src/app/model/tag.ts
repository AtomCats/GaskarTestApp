import {Book} from './book';

export class Tag {
  id: number;
  name: string;
  books: Array<Book>;
}
