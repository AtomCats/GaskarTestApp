import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import {FormsModule} from "@angular/forms";
import {UserService} from "./service/user-service.service";
import { CreateUserComponent } from './create-user/create-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import {HttpClientModule} from "@angular/common/http";
import { ItemListComponent } from './item-list/item-list.component';
import { AuthorsListComponentComponent } from './authors-list-component/authors-list-component.component';
import { CreateAuthorFormComponent } from './create-author-form/create-author-form.component';
import { BooksListComponent } from './books-list/books-list.component';
import { CreateBookFormComponent } from './create-book-form/create-book-form.component';
import { PublishersListComponent } from './publishers-list/publishers-list.component';
import { CreatePublisherFormComponent } from './create-publisher-form/create-publisher-form.component';
import { TagsListComponent } from './tags-list/tags-list.component';
import { CreateTagFormComponent } from './create-tag-form/create-tag-form.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    UserListComponent,
    UserFormComponent,
    CreateUserComponent,
    UserDetailsComponent,
    ItemListComponent,
    AuthorsListComponentComponent,
    CreateAuthorFormComponent,
    BooksListComponent,
    CreateBookFormComponent,
    PublishersListComponent,
    CreatePublisherFormComponent,
    TagsListComponent,
    CreateTagFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
