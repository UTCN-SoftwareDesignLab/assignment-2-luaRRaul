package com.cartismh.report;

import com.cartismh.book.BookRepository;
import com.cartismh.book.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.cartismh.report.ReportType.CSV;

@Service
@RequiredArgsConstructor
public class CSVReportService implements ReportService {
    private final BookRepository bookRepository;

    @Override
    public String export() {
        List<Book> books = bookRepository.findBookByQuantity(0);
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(HEADER);
        reportBuilder.append("\n");
        for (Book book : books) {
            reportBuilder.append(book.getId());
            reportBuilder.append(",");
            reportBuilder.append(book.getTitle());
            reportBuilder.append(",");
            reportBuilder.append(book.getAuthor());
            reportBuilder.append(",");
            reportBuilder.append(book.getGenre());
            reportBuilder.append(",");
            reportBuilder.append(book.getPrice());
            reportBuilder.append("\n");
        }
        return reportBuilder.toString();
    }

    @Override
    public ReportType getType() {
        return CSV;
    }
}
