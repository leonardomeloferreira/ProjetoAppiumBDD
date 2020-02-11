package br.com.rsinet_hub.managers;

import br.com.rsinet_hub.dataProviders.ReadProperties;

public class FileReaderManager {

		private static FileReaderManager fileReaderManager = new FileReaderManager();
		private static ReadProperties readProperties;

		private FileReaderManager() {
		}

		public static FileReaderManager getInstance() {
			return fileReaderManager;
		}

		public ReadProperties getReadProperties() {
			return (readProperties == null) ? new ReadProperties() : readProperties;
		}
	

}
