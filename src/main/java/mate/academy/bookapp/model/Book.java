package mate.academy.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@ToString(exclude = {"description", "coverImage"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private String title;
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private String author;
    @Column(nullable = false, unique = true)
    @EqualsAndHashCode.Include
    private String isbn;
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private BigDecimal price;
    private String description;
    @Column(name = "cover_image")
    private String coverImage;
}
