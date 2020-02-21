package com.chainsys.OtherClass;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

public class Msg91{
        public static int msg()
    	{
            String authkey = "243477AVOV0jN2Q5bc967d9";
            String mobiles = "6379434293";
            String senderId = "SEENII";
            String country = "91";
            Random rand=new Random();
            int message=rand.nextInt(99999);
            String route="4";
            URLConnection myURLConnection=null;
            URL myURL=null;
            BufferedReader reader=null;
            //String encoded_message=URLEncoder.encode(message);
           //System.out.println(encoded_message);
            String mainUrl="https://api.msg91.com/api/v2/sendsms?";
            StringBuilder sbPostData= new StringBuilder(mainUrl);
            sbPostData.append("authkey="+authkey);
            sbPostData.append("&mobiles="+mobiles);
            sbPostData.append("&message=Your OTP for MusicApp Registration is "+message);
            sbPostData.append("&route="+route);
            sbPostData.append("&country=" + country);
            sbPostData.append("&sender="+senderId);
            mainUrl = sbPostData.toString();
            try
            {
                myURL = new URL(mainUrl);
                myURLConnection = myURL.openConnection();
                myURLConnection.connect();
                reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
                String response;
                while ((response = reader.readLine()) != null)
                System.out.println(response);
                reader.close();
            }
            catch (IOException e)
            {
                    Logger.error(e.getMessage());
            }
            return message;
        }public static void main(String[] args) {
			Msg91.msg();
		}
}