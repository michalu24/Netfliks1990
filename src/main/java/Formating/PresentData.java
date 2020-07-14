package Formating;

import FilmCatalog.FilmGenre;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class PresentData {

    public static void ofFilmGenreCatalog(FilmGenre filmGenre) {

        switch (filmGenre) {
            case GENRE_FAMILY:

                try {
                    InputStream inp = new FileInputStream("Family.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Family.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;

                        System.out.println("_____________________________________________");
                        System.out.println("Numer "+row.getRowNum());
                        System.out.println("_____________________________________________");
                        System.out.println(row.getCell(0).getStringCellValue());
                        System.out.println(row.getCell(1).getStringCellValue());
                        System.out.println(row.getCell(2).getStringCellValue());
                        System.out.println("_____________________________________________");

                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_DRAMA:


        }

    }
}
