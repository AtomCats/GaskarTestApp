import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {UserListComponent} from './user-list/user-list.component';
import {CreateUserComponent} from "./create-user/create-user.component";
import {AppComponent} from "./app.component";
import {ItemListComponent} from "./item-list/item-list.component";
import {AuthorsListComponentComponent} from "./authors-list-component/authors-list-component.component";
import {CreateAuthorFormComponent} from "./create-author-form/create-author-form.component";
import {BooksListComponent} from "./books-list/books-list.component";
import {CreateBookFormComponent} from "./create-book-form/create-book-form.component";
import {PublishersListComponent} from "./publishers-list/publishers-list.component";
import {CreatePublisherFormComponent} from "./create-publisher-form/create-publisher-form.component";
import {TagsListComponent} from "./tags-list/tags-list.component";
import {CreateTagFormComponent} from "./create-tag-form/create-tag-form.component";

const routes: Routes = [
  { path: 'authors', component: AuthorsListComponentComponent },
  { path: 'addAuthor', component: CreateAuthorFormComponent },
  { path: 'books', component: BooksListComponent },
  { path: 'addBook', component: CreateBookFormComponent },
  { path: 'publishers', component: PublishersListComponent },
  { path: 'addPublisher', component: CreatePublisherFormComponent },
  { path: 'tags', component: TagsListComponent },
  { path: 'addTag', component: CreateTagFormComponent },
  // { path: '', redirectTo: 'showItems', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
