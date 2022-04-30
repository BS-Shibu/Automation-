package com.Propertyfile;

public class FileReaderManager 
{
	private FileReaderManager() {
		
	}
	public static FileReaderManager getInstanceFRM() {
		FileReaderManager frm = new FileReaderManager();
			return frm;
	}
	public CofigurationReader getInstanceCR() throws Throwable {
		CofigurationReader reader = new CofigurationReader();
			return reader;
	}
}
