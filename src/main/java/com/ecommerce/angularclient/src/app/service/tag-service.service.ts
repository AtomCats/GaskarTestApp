import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Book} from "../model/book";
import {Publisher} from "../model/publisher";
import {Tag} from "../model/tag";

@Injectable({
  providedIn: 'root'
})
export class TagServiceService {

  private tagUrl: string;

  constructor(private http: HttpClient) {
    this.tagUrl = 'http://localhost:8080/tags';
  }

  public findAll() {
    return this.http.get<Tag[]>('${this.tagUrl}/all');
  }

  public save(tag: Tag) {
    return this.http.post(`${this.tagUrl}/add`, tag);
  }
}
