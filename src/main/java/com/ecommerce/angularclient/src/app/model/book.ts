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
}
