import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Author} from "../model/author";
import {FindForm} from "../model/find-form";
import {Book} from "../model/book";

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  private booksUrl: string;

  constructor(private http: HttpClient) {
    this.booksUrl = 'http://localhost:8080/books';
  }

  public findAll() {
    return this.http.get<Book[]>('${this.booksUrl}/all');
  }

  public findAllByTagOrPublisher(findForm: FindForm) {
    return this.http.post<Book[]>('${this.booksUrl}/all', findForm);
  }

  public save(book: Book) {
    return this.http.post(`${this.booksUrl}/add`, book);
  }
}
