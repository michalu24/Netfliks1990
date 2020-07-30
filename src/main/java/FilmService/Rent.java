package FilmService;

import FilmCatalog.FilmGenre;
import Formating.PresentData;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.Scanner;


public class Rent {

    public static void familyFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_FAMILY);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_FAMILY);



    }

    public static void horrorFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_HORROR);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_HORROR);

    }
    public static void comedyFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_COMEDY);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_COMEDY);

    }
    public static void adventureFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_ADVENTURE);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_ADVENTURE);

    }
    public static void dramaFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_DRAMA);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_DRAMA);

    }
    public static void sciFiFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_SCIFI);
        System.out.println("Podaj numer:\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        findMovieAndRent(choice,FilmGenre.GENRE_SCIFI);

    }

    public static void findMovieAndRent(int number, FilmGenre Genre) {
        switch (Genre) {
            case GENRE_FAMILY:
                try {
                    InputStream inp = new FileInputStream("Family.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Family.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    cell.setCellStyle(style);

                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());

                    wb.write(new FileOutputStream("Family.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_ADVENTURE:
                try {
                    InputStream inp = new FileInputStream("Adventure.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Adventure.xls");

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());


                    wb.write(new FileOutputStream("Adventure.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_COMEDY:
                try {
                    InputStream inp = new FileInputStream("Comedy.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Comedy.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    cell.setCellStyle(style);
                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());


                    wb.write(new FileOutputStream("Comedy.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_SCIFI:
                try {
                    InputStream inp = new FileInputStream("SciFi.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("SciFi.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    cell.setCellStyle(style);
                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());


                    wb.write(new FileOutputStream("SciFi.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_HORROR:
                try {
                    InputStream inp = new FileInputStream("Horror.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Horror.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    cell.setCellStyle(style);
                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());


                    wb.write(new FileOutputStream("Horror.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_DRAMA:
                try {
                    InputStream inp = new FileInputStream("Drama.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Drama.xls");

                    CellStyle style = wb.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

                    Row row =  sheet.getRow(number);
                    Cell cell = row.getCell(2);
                    cell.setCellValue("Zajęty");
                    cell.setCellStyle(style);
                    Cell cellTitle = row.getCell(0);
                    System.out.println("Wypożyczono:   "+cellTitle.getStringCellValue());


                    wb.write(new FileOutputStream("Drama.xls"));
                    wb.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


        }
    }
}
