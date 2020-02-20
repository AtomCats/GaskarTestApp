import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Book} from "../model/book";
import {FindForm} from "../model/find-form";
import {Publisher} from "../model/publisher";

@Injectable({
  providedIn: 'root'
})
export class PublisherServiceService {

  private publisherUrl: string;

  constructor(private http: HttpClient) {
    this.publisherUrl = 'http://localhost:8080/publishers';
  }

  public findAll() {
    return this.http.get<Publisher[]>('${this.publisherUrl}/all');
  }

  public save(publisher: Publisher) {
    return this.http.post(`${this.publisherUrl}/add`, publisher);
  }
}
