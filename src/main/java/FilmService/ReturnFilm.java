package FilmService;

import FilmCatalog.FilmGenre;
import org.apache.poi.ss.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

public class ReturnFilm {

    public static void toBase(FilmGenre genre) {
        Scanner scanner = new Scanner(System.in);
        int number;
        switch (genre) {
            case GENRE_ADVENTURE:
                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("Adventure.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Adventure.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Adventure.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_SCIFI:

                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("SciFi.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("SciFi.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("SciFi.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_HORROR:

                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("Horror.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Horror.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Horror.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_FAMILY:

                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("Family.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Family.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Family.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_COMEDY:

                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("Comedy.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Comedy.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Comedy.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_DRAMA:

                System.out.println("Który film chcesz zwrócić: \n");
                TakenFilms.show(genre);
                System.out.println("Wybierz numer:   ");
                number = scanner.nextInt();

                try {
                    InputStream inp = new FileInputStream("Drama.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Drama.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor((short)0);


                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Wolny");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Zwrócono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Drama.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}