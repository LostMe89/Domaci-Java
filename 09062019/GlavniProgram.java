package Domaci_09062019;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GlavniProgram {

	public static void main(String[] args) {
		try {
			File src = new File("Data (DOM).xls");
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook wbe = new HSSFWorkbook(fis);
			HSSFSheet sheet1 = wbe.getSheetAt(0);
			int rowcount = sheet1.getLastRowNum();
			int suma = 0;
			System.out.println("Broj redova je: " + (rowcount + 1));
			for (int i = 0; i <= rowcount; i++) {
				HSSFRow r = sheet1.getRow(i);
				if (r != null) {
					double data0 = r.getCell(0).getNumericCellValue();
					suma += data0;
				} else {
					System.out.println("<Empty row>");
				}
			}
			System.out.println("Suma brojeva u Cell-ovima je: " + suma);
			wbe.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
