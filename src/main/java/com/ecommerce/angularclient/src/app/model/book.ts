import {Publisher} from './publisher';
import {Tag} from './tag';
import {Author} from './author';

export class Book {
  id: number;
  name: string;
  releaseYear: number;
  publisher: Publisher;
  authors: Array<Author>;
  tags: Array<Tag>;

  constructor(args: {
    name: string,
    releaseYear: number,
    publisher: Publisher,
    authors: Author[],
    tags: Tag[],
    id: number
  }) {
    this.id = args.id;
    this.name = args.name;
    this.releaseYear = args.releaseYear;
    // this.publisher = args.publisher.map(json => new Publisher(json));
    this.publisher = new Publisher(args.publisher);
    this.authors = args.authors.map(json => new Author(json));
    this.tags = args.tags.map(json => new Tag(json));
  }
}
