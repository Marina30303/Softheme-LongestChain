import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Chain {

    public static int LongestChain(String input)
    {
        char charArr[] = input.toCharArray();
        int max = 0, count = 0;
        for (int i = 0; i<input.length();i++)
        {
            if (charArr[i]=='1')
            {
                count++;
            }else {
                if (count > max)
                    max = count;
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;

        try {
            File file = new File("input.txt");
            in = new FileInputStream("input.txt");
            DataOutputStream out = new DataOutputStream(new FileOutputStream("output.txt"));

            byte fileData[] = new byte[(int)file.length()];
            in.read(fileData);
            String s = new String(fileData);
            
            out.writeUTF((LongestChain(s)+""));
        }finally {
            if (in != null) {
                in.close();
            }
        }
    }
    }

