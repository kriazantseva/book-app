package mate.academy.bookapp.service;

import java.util.List;
import mate.academy.bookapp.dto.BookDto;
import mate.academy.bookapp.dto.BookSearchParametersDto;
import mate.academy.bookapp.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    List<BookDto> search(BookSearchParametersDto searchParametersDto);

    BookDto update(Long id, CreateBookRequestDto requestDto);

    void deleteById(Long id);
}
