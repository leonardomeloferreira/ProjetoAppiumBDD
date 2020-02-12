package br.com.rsinet.hub_bdd.util;

public class DataExcel {

	public static String nomeLaptopValido() throws Exception {
		return ExcelUtils.getCellData(1, 0);
	}
	public static String nomeLaptopInvalido() throws Exception {
		return ExcelUtils.getCellData(2, 0);
	}
}
