package mate.academy.bookapp.mapper;

import java.util.List;
import mate.academy.bookapp.config.MapperConfig;
import mate.academy.bookapp.dto.BookDto;
import mate.academy.bookapp.dto.CreateBookRequestDto;
import mate.academy.bookapp.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    List<BookDto> toDtoList(List<Book> books);

    Book toModel(CreateBookRequestDto requestDto);

    void updateBookFromDto(CreateBookRequestDto requestDto, @MappingTarget Book entity);
}
