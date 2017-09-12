package processKiller.try1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class processKiller {
	public static void main(String[] args) throws IOException {

		Process p = Runtime.getRuntime().exec("tasklist.exe");
		Process process = Runtime.getRuntime().exec("tasklist.exe");
		Scanner scanner = new Scanner(new InputStreamReader(process.getInputStream()));
		{
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}

			System.out.println("Which process that you want to terminate ?");
			String pid = "";
			Scanner scanner2 = new Scanner(System.in);
			pid=scanner2.nextLine();
			 Process p2 = Runtime.getRuntime().exec(pid);
			    p2.destroy();
			//"taskkill /F /IM <processname>.exe" seklinde input girdisi gerekiyor.
		}
	}
}
