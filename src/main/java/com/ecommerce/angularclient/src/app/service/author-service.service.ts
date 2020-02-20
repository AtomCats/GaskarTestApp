import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Author} from "../model/author";
import {FindForm} from "../model/find-form";

@Injectable({
  providedIn: 'root'
})
export class AuthorServiceService {

  private authorsUrl: string;

  constructor(private http: HttpClient) {
    this.authorsUrl = 'http://localhost:8080/authors';
  }

  public findAll() {
    return this.http.get<Author[]>('http://localhost:8080/authors/all');
  }

  public findAllByTagOrPublisher(findForm: FindForm) {
    return this.http.post<Author[]>('${this.authorsUrl}/all', findForm);
  }

  public save(author: Author) {
    return this.http.post(`${this.authorsUrl}/add`, author);
  }
}
