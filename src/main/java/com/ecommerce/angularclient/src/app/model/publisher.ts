import {Book} from './book';

export class Publisher {
  id: number;
  name: string;
  books: Array<Book>;

  constructor(args: {
    name: string,
    books: Book[],
    id: number
  }) {
    this.id = args.id,
      this.name = args.name,
      this.books = args.books.map(json => new Book(json));
  }
}
