import java.io.*;
import java.util.*;
import java.lang.Math;





 class jkm80{

    static cin in = new cin(new InputStreamReader(System.in));
    static PrintWriter w = new PrintWriter(System.out);
    



    public static void main(String[] args){
    	HashMap<String,Integer> m = new HashMap<String,Integer>();
    	m.put("sunny",2);
    	m.put("snenny",7);
    	System.out.println(m.get("sunny"));
    	System.out.println(m.get("moovon"));

    }




      public static class cin {
        public BufferedReader scan;
        public StringTokenizer st;
        public cin(InputStreamReader stream) {
            scan = new BufferedReader(stream);
            st = null;
        }
        public cin(FileReader stream){
            scan = new BufferedReader(stream);
            st = null;
        }
        public String string() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(scan.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(string());
        }
        public String Line() throws IOException{
            return scan.readLine();
        }
        public long Long(){
            return Long.parseLong(string());
        }
        public double Double(){
            return Double.parseDouble(string());
        }

    }

}