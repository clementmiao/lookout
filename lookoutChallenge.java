// package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class lookoutChallenge {

	public static void parseString(String line) {
		String[] mainSplits = line.split("[;]");
		String mainNumber = mainSplits[0]; 
		String[] vars = mainSplits[1].split("[,]");
		System.out.println("mainNumber: " + mainNumber);
		for (int i = 0; i < vars.length; i++) {
			System.out.println("var " + i + " : " + vars[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		String file_name = args[0];

		try {
			BufferedReader br = new BufferedReader(new FileReader(file_name));
			String line;
			while ((line = br.readLine()) != null) {
				parseString(line);
				//System.out.println(line);
			}
			br.close();
		}
		
		catch (IOException e) {
			System.out.println( e.getMessage() );
		}
	}
}