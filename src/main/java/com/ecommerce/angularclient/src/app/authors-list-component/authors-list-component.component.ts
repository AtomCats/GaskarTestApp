import { Component, OnInit } from '@angular/core';
import {User} from "../model/user";
import {UserService} from "../service/user-service.service";
import {Author} from "../model/author";
import {AuthorServiceService} from "../service/author-service.service";
import {catchError, map} from "rxjs/operators";

@Component({
  selector: 'app-authors-list-component',
  templateUrl: './authors-list-component.component.html',
  styleUrls: ['./authors-list-component.component.css']
})
export class AuthorsListComponentComponent implements OnInit {

  authors: Author[];

  constructor(private authorService: AuthorServiceService) {
  }

  ngOnInit() {
     // this.authorService.findAll().subscribe((data: Author[]) => this.authors = data);
    // map(categories => categories.map(categoryJson => new CategoryModel(categoryJson))),
    //   catchError(this.handleError('getProduct', []))
     this.authorService.findAll().subscribe(data => this.authors = data);
    // //   .toPromise()
  }
}
