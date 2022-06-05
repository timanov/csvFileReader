import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVWintScanner {

    public static void main(String[] args) throws IOException {
        // открываем файл
        BufferedReader reader = new BufferedReader(new FileReader(
                "test.csv"));

        // считываем построчно
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Employee> emplist = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Employee emp = new Employee();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    emp.setId(Integer.parseInt(data));
                else if (index == 1)
                    emp.setName(data);
                else if (index == 2)
                    emp.setGroup(data);
                else if (index == 3)
                    emp.setVersion(data);
                else if (index == 4)
                    emp.setIp(data);
                else
                    System.out.println("Incorrent data from::" + data);
            }

            // закрываем ридер
            reader.close();

            System.out.println(emplist);

        }
    }
}
