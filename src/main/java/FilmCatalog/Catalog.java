package FilmCatalog;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Catalog {

    private final String fileName;

    public Catalog(String fileName) {
        Pattern pattern = Pattern.compile("(.+)\\.xls");
        Matcher matcher = pattern.matcher(fileName);
        if (matcher.matches()) {
            this.fileName = fileName;
        } else throw new IllegalArgumentException("Name should be like : file.xls !");



    }

    public void create() {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet1 = workbook.createSheet(this.fileName);
        sheet1.setDefaultColumnWidth(55);

        //Definicja czcionki
        Font fontTitle = workbook.createFont();
        fontTitle.setFontHeightInPoints((short) 16);
        fontTitle.getBold();
        fontTitle.setColor(IndexedColors.WHITE.getIndex());

        //Definicja stylu
        CellStyle mainStyle = workbook.createCellStyle();
        mainStyle.setAlignment(HorizontalAlignment.CENTER);
        mainStyle.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.getIndex());
        mainStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        mainStyle.setFont(fontTitle);

        HSSFRow row = sheet1.createRow(0);
        {
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("Tytuł filmu");
            cell.setCellStyle(mainStyle);

            HSSFCell cell1 = row.createCell(1);
            cell1.setCellValue("Opis");
            cell1.setCellStyle(mainStyle);


            HSSFCell cell2 = row.createCell(2);
            cell2.setCellValue("Status");
            cell2.setCellStyle(mainStyle);

        }


        try {
            workbook.write(new FileOutputStream(this.fileName));
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getFileName() {
        return fileName;
    }
}
