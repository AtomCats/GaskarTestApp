import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Author} from "../model/author";
import {FindForm} from "../model/find-form";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class AuthorServiceService {

  private authorsUrl: string;

  constructor(private http: HttpClient) {
    this.authorsUrl = 'http://localhost:8080/authors';
  }

  public findAll(): Observable<Author[]> {
    return this.http.get<Author[]>('http://localhost:8080/authors/all')
      .pipe(map(authors => authors.map(authorJson => new Author(authorJson))));
  }

  public findAllByTagOrPublisher(findForm: FindForm) {
    return this.http.post<Author[]>('${this.authorsUrl}/all', findForm);
  }

  public save(author: Author) {
    return this.http.post(`${this.authorsUrl}/add`, author);
  }
}
