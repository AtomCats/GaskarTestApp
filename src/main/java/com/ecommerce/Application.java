package com.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.time.Instant;
import java.util.*;

import com.ecommerce.spring.model.*;
import com.ecommerce.spring.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, AdminRepository adminRepository,
                           UserPermissionRepository permissionRepository, ItemRepository itemRepository,
                           ItemCategoryRepository itemCategoryRepository, AuthorRepository authorRepository, BookRepository bookRepository,
                           PublisherRepository publisherRepository) {
        return args -> {
            Publisher publisher = publisherRepository.save(new Publisher("Publisher", new ArrayList<Book>()));
            Book book = bookRepository.save(new Book("Some intresting book", 2000, publisher, new ArrayList<Author>(), new ArrayList<Tag>()));
            Author author = authorRepository.save(new Author("Anton", "Eremin", "Alexandrovich", Date.from(Instant.now()), new ArrayList<Book>()));
            publisher.setBooks(Arrays.asList(book));
            Publisher publisher1 = publisherRepository.save(publisher);
            System.out.println(publisher1.getBooks());
//            book.setAuthors(Arrays.asList(author));
//            author.setBooks(Arrays.asList(book));
//            bookRepository.save(book);
//            authorRepository.save(author);

//            UserPermission adminPermission = new UserPermission(1, "Admin", null);
//            UserPermission userPermission = new UserPermission(2, "User", null);
///*            UserPermission adminPermission = new UserPermission(1, "Admin");
//            UserPermission userPermission = new UserPermission(2, "User");*/
//            permissionRepository.save(adminPermission);
//            permissionRepository.save(userPermission);
//
//            userRepository.save(new User(1l,"Anton1", "Anton", "Eremin", Arrays.asList(adminPermission)));
//            userRepository.save(new User(2l,"Bonifacy", "Bon", "Eremin", Arrays.asList(userPermission)));
///*            userRepository.save(new User(1l,"Anton1", "Anton", "Eremin"));
//            userRepository.save(new User(2l,"Bonifacy", "Bon", "Eremin"));*/
//
//            ItemCategory furniture = new ItemCategory(null,"Furniture", "Мягкая мебель",
//                    null);
//            ItemCategory cabinetFurniture = new ItemCategory(null,"Сabinet furniture", "Корпусная мебель",
//                    null);
//            itemCategoryRepository.save(furniture);
//            itemCategoryRepository.save(cabinetFurniture);
//
//
//            //save image into database
//            byte[] sofaImg = Objects.requireNonNull(getClass().getClassLoader()
//                    .getResourceAsStream("Images/sofa.jpg")).readAllBytes();
//            byte[] livingRoomImg = Objects.requireNonNull(getClass().getClassLoader()
//                    .getResourceAsStream("Images/cabinetFurniture.jpg")).readAllBytes();
//
//            Item couch = new Item(1L, "Couch",200F,sofaImg,
//                    Collections.singletonList(itemCategoryRepository.findItemCategoryByName("Furniture")));
//            Item livingRoomFurniture = new Item(1L, "Living room furniture",500F,livingRoomImg,
//                    Collections.singletonList(itemCategoryRepository.findItemCategoryByName("Сabinet furniture")));
//
//            itemRepository.save(couch);
//            itemRepository.save(livingRoomFurniture);
        };
    }
}
