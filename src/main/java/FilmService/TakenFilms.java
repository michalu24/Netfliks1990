package FilmService;

import FilmCatalog.FilmGenre;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class TakenFilms {


    public static void show(FilmGenre genre) {

        switch (genre) {

            case GENRE_FAMILY:
                try {
                    InputStream inp = new FileInputStream("Family.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Family.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case GENRE_SCIFI:
                try {
                    InputStream inp = new FileInputStream("SciFi.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("SciFi.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case GENRE_HORROR:
                try {
                    InputStream inp = new FileInputStream("Horror.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Horror.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case GENRE_COMEDY:
                try {
                    InputStream inp = new FileInputStream("Comedy.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Comedy.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_ADVENTURE:
                try {
                    InputStream inp = new FileInputStream("Adventure.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Adventure.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case GENRE_DRAMA:
                try {
                    InputStream inp = new FileInputStream("Drama.xls");
                    Workbook wb = WorkbookFactory.create(inp);
                    Sheet sheet = wb.getSheet("Drama.xls");

                    Iterator<Row> rowIterator = sheet.rowIterator();

                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        if (row.getRowNum() == 0) continue;
                        else if (row.getCell(2).getStringCellValue().equalsIgnoreCase("ZAJĘTY")) {

                            System.out.println("_____________________________________________");
                            System.out.println("Numer " + row.getRowNum());
                            System.out.println("_____________________________________________");
                            System.out.println(row.getCell(0).getStringCellValue());
                            System.out.println(row.getCell(1).getStringCellValue());
                            System.out.println(row.getCell(2).getStringCellValue());
                            System.out.println("_____________________________________________");
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;


        }


    }
}
