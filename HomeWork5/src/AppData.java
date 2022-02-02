import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }


    public void read(File file) {
        int size = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                size++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            System.out.println(size);

        data = new int[size - 1][];

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            header = reader.readLine().split(";");

            String str;
            int tmp = 0;
            while ((str = reader.readLine()) != null) {

                String[] d = str.split(";");
                int x1 = Integer.parseInt(d[0]);
                int x2 = Integer.parseInt(d[1]);
                int x3 = Integer.parseInt(d[2]);
                data[tmp] = new int[]{x1, x2, x3};
                tmp++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void write (File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(header[0] + ";" + header[1] + ";" + header[2] + "\n");
                for (int[] arr : data) {
                    writer.write(arr[0] + ";" + arr[1] + ";" + arr[2] + "\n");
                }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

}


